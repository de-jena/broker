FROM eclipse-temurin:17-jre-alpine

ENV USERNAME=bridge \
	HOME_DIR=/bridge \
	OPT_DIR=/opt/bridge \
	GECKO_VERSION=2.0.0

RUN mkdir -p ${OPT_DIR} && \
    mkdir -p ${OPT_DIR}/logs && \
    mkdir -p /tmp

COPY content/ ${OPT_DIR}/

RUN mkdir ${HOME_DIR}

RUN addgroup -g 7743 -S ${USERNAME} && \
    adduser -u 7743 -h ${HOME_DIR} -s /bin/false -S ${USERNAME} -G ${USERNAME}

RUN chown -R ${USERNAME} ${OPT_DIR} && \
    chmod -R u+rwx ${OPT_DIR} && \
    chown -R ${USERNAME} /tmp && \
    chmod -R u+rw /tmp

RUN cd ${OPT_DIR}

VOLUME ${HOME_DIR}

EXPOSE 8080 8081 8082 8083 8084 8085 8090
WORKDIR ${OPT_DIR}
USER ${USERNAME}

CMD ["java", "-server", "-Xmx4000M", "-Xms2G", "-Dgosh.args=--nointeractive", "-Dgecko.data.dir=/opt/bridge/runtime/data", "-Dgecko.conf.dir=/opt/bridge/runtime/etc", "-Dgecko.base.dir=/bridge/mdo", "-Dgecko.log.dir=/opt/bridge/runtime/log", "-Dlogback.configurationFile=file:/opt/bridge/runtime/etc/logback.xml",  "-jar", "de.jena.mqttbridge.runtime.jar"]
