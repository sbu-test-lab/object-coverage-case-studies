#!/bin/sh
javac -cp ../cases-jars/apache-validator/*:../tools-jars/evosuite/*:../tools-jars/junit/* evosuite-tests/org/apache/commons/collections4/map/*.java

java -cp evosuite-tests/:../cases-jars/apache-validator/*:../tools-jars/evosuite/*:../tools-jars/junit/* -javaagent:../tools-jars/ocov/ocov.jar=org.apache.commons.validator.routines,_ESTest org.junit.runner.JUnitCore  org.apache.commons.validator.routines.TimeValidator_ESTest 

java -jar ../tools-jars/ocov/ocov.jar -a ./oocov-coverable-lines.csv -c ./oocov-covered-lines.csv
