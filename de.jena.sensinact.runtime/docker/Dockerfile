FROM adoptopenjdk/openjdk8-openj9:alpine-jre

ENV USERNAME=sensinact \
	HOME_DIR=/sensinact \
	OPT_DIR=/opt/sensinact

RUN mkdir -p ${OPT_DIR} && \
    mkdir -p ${OPT_DIR}/logs && \
    mkdir -p /tmp

COPY /content/ ${OPT_DIR}/

RUN mkdir ${HOME_DIR}

RUN addgroup -g 7743 -S ${USERNAME} && \
    adduser -u 7743 -h ${HOME_DIR} -s /bin/false -S ${USERNAME} -G ${USERNAME}

RUN chown -R ${USERNAME} ${OPT_DIR} && \
    chmod -R u+rwx ${OPT_DIR} && \
    chown -R ${USERNAME} /tmp && \
    chmod -R u+rw /tmp

RUN cd ${OPT_DIR}

VOLUME ${HOME_DIR}

EXPOSE 8080 6671
WORKDIR ${OPT_DIR}
USER ${USERNAME}

CMD ["java", "-Xms64m", "-Xmx256m", "-Dlogback.configurationFile=conf/logback.xml", "-Djava.security.egd=file:/dev/./urandom", "-Djava.security.policy=conf/all.policy", "-Dfelix.config.properties=file:conf/config.properties", "-Dgosh.args=--nointeractive", "-jar", "bin/felix.jar"]

#CMD ["ls", "-l"]