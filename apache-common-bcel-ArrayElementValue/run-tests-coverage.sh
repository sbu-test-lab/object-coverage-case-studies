#!/bin/sh
javac -cp ../cases-jars/apache-commons-bcel/*:../tools-jars/evosuite/*:../tools-jars/junit/* evosuite-tests/org/apache/bcel/classfile/*.java

java -cp evosuite-tests/:../cases-jars/apache-commons-bcel/*:../tools-jars/evosuite/*:../tools-jars/junit/*: -javaagent:../tools-jars/ocov/ocov.jar=org.apache.bcel.classfile,_ESTest  org.junit.runner.JUnitCore org.apache.bcel.classfile.ArrayElementValue_ESTest 

java -jar ../tools-jars/ocov/ocov.jar -a ./oocov-coverable-lines.csv -c ./oocov-covered-lines.csv
