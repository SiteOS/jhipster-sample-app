#!/bin/bash

CP=""
for i in target/modules/*.jar; do
  CP="$CP:$i"
done
CP="$CP:."

$JAVA_HOME/bin/java -cp "$CP" io.github.jhipster.sample.JhipsterSampleApplicationApp

