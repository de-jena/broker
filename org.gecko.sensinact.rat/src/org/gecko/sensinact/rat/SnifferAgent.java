/**
 * Copyright (c) 2012 - 2021 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.gecko.sensinact.rat;

import org.eclipse.sensinact.gateway.core.message.AgentRelay;
import org.eclipse.sensinact.gateway.core.message.MidCallbackException;
import org.eclipse.sensinact.gateway.core.message.SnaLifecycleMessageImpl;
import org.eclipse.sensinact.gateway.core.message.SnaMessage;
import org.eclipse.sensinact.gateway.core.message.SnaUpdateMessageImpl;
import org.eclipse.sensinact.gateway.core.message.annotation.Filter;
import org.eclipse.sensinact.gateway.core.message.whiteboard.AbstractAgentRelay;
import org.osgi.service.component.annotations.Component;

/**
 * 
 * @author mark
 * @since 24.09.2021
 */
@Component(immediate= true, service = AgentRelay.class)
@Filter(sender = "(/[^/]+)+", isPattern = true, handled = {SnaMessage.Type.LIFECYCLE, SnaMessage.Type.UPDATE})
public class SnifferAgent extends AbstractAgentRelay {
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.gateway.core.message.whiteboard.AbstractAgentRelay#doHandle(org.eclipse.sensinact.gateway.core.message.SnaUpdateMessageImpl)
	 */
	@Override
	public void doHandle(SnaUpdateMessageImpl message) throws MidCallbackException {
		System.err.println("Handle update message: " + message.getPath());
		System.out.println(message.getNotification().toString());
		super.doHandle(message);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.sensinact.gateway.core.message.whiteboard.AbstractAgentRelay#doHandle(org.eclipse.sensinact.gateway.core.message.SnaLifecycleMessageImpl)
	 */
	@Override
	public void doHandle(SnaLifecycleMessageImpl message) throws MidCallbackException {
		System.err.println("Handle lifecycle message: " + message.getPath());
		System.out.println(message.getNotification().toString());
		super.doHandle(message);
	}

}
