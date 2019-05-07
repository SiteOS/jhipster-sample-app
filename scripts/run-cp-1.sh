#!/bin/bash

CP=""
for i in target/modules/*.jar; do
  CP="$CP:$i"
done
CP="$CP:."

$JAVA_HOME/bin/java -cp "$CP" -jar target/modules/jhipster-sample-application-0.0.1-SNAPSHOT.jar

