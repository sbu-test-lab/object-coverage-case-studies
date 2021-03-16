#!/bin/sh
javac -cp ../cases-jars/ta4j/*:../tools-jars/evosuite/*:../tools-jars/junit/* evosuite-tests/org/ta4j/core/indicators/*.java

java -cp evosuite-tests/:../cases-jars/ta4j/*:../tools-jars/evosuite/*:../tools-jars/junit/* -javaagent:../tools-jars/ocov/ocov.jar=org.ta4j.core.indicators,_ESTest org.junit.runner.JUnitCore  org.ta4j.core.indicators.DPOIndicator_ESTest 

java -jar ../tools-jars/ocov/ocov.jar -a ./oocov-coverable-lines.csv -c ./oocov-covered-lines.csv
