#!/bin/bash

CP=""
for i in target/modules/*.jar; do
  CP="$CP:$i"
done
CP="$CP:."

/usr/lib/jvm/java-11/bin/java -cp "$CP" io.github.jhipster.sample.JhipsterSampleApplicationApp

