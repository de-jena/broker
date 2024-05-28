package de.jena.traficam.test;

import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.Test;
import org.osgi.util.promise.Deferred;
import org.osgi.util.promise.Promise;
import org.osgi.util.promise.PromiseFactory;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.PushStreamProvider;
import org.osgi.util.pushstream.QueuePolicyOption;
import org.osgi.util.pushstream.SimplePushEventSource;

public class TestPush {

	@Test
	public void testPushStream() throws Exception {
		final PromiseFactory pf = new PromiseFactory(PromiseFactory.inlineExecutor());

		final PushStreamProvider psp = new PushStreamProvider();
		final SimplePushEventSource<Integer> source = psp.buildSimpleEventSource(Integer.class)
				.withQueuePolicy(QueuePolicyOption.BLOCK).build();

		final Deferred<Instant> startD = pf.deferred();
		final Deferred<Instant> endD = pf.deferred();

		Promise<Long> nbEvent = psp.buildStream(source).unbuffered().build().filter((i) -> {
			if (i == 0) {
				startD.resolve(Instant.now());
			}
			return true;
		}).count()
				.onResolve(() -> endD.resolve(Instant.now()));

		for (int i = 0; i < 1000; i++) {
			source.publish(i);
		}
		source.endOfStream();

		System.out.println("PushStream needs "
				+ Duration.between(startD.getPromise().getValue(), endD.getPromise().getValue()).toMillis()
				+ " milliseconds to process " + nbEvent.getValue() + " events.");
	}

	@Test
	public void testSplit() throws Exception {
		final PromiseFactory pf = new PromiseFactory(PromiseFactory.inlineExecutor());
		
		final PushStreamProvider psp = new PushStreamProvider();
		final SimplePushEventSource<Integer> source = psp.buildSimpleEventSource(Integer.class)
				.withQueuePolicy(QueuePolicyOption.BLOCK).build();
		
		
		PushStream<Integer> ps = psp.buildStream(source).unbuffered().build();
		ps.window(Duration.ofSeconds(3), (values) -> {
			System.out.println("- "+ values);
			return values;
		});
		ps.coalesce(3, (values) -> {
			System.out.println("- "+ values);
			return values;
		});
		
		for (int i = 0; i < 1000; i++) {
			source.publish(i);
			Thread.sleep(1000);
		}
		source.endOfStream();
        
	}
}