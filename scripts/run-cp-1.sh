#!/bin/bash

CP=""
for i in target/modules/*.jar; do
  CP="$CP:$i"
done
CP="$CP:."

/usr/lib/jvm/java-11/bin/java -cp "$CP" -jar target/modules/jhipster-sample-application-0.0.1-SNAPSHOT.jar

