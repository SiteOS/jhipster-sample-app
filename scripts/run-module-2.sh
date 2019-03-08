#!/bin/bash

mv target/modules/spring-cloud-spring-service-connector-2.0.4.RELEASE.jar .

/usr/lib/jvm/java-11/bin/java --module-path target/modules -jar target/modules/jhipster-sample-application-0.0.1-SNAPSHOT.jar --patch-module spring.cloud.connectors.core=spring-cloud-spring-service-connector-2.0.4.RELEASE.jar
