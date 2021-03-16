#!/bin/sh
javac -cp ../cases-jars/google-guava/*:../tools-jars/evosuite/*:../tools-jars/junit/* evosuite-tests/com/google/common/graph/*.java

java -cp evosuite-tests/:../cases-jars/google-guava/*:../tools-jars/evosuite/*:../tools-jars/junit/* -javaagent:../tools-jars/ocov/ocov.jar=com.google.common.graph,_ESTest org.junit.runner.JUnitCore  com.google.common.graph.StandardMutableNetwork_ESTest

java -jar ../tools-jars/ocov/ocov.jar -a ./oocov-coverable-lines.csv -c ./oocov-covered-lines.csv
