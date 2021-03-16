#!/bin/sh
javac -cp ../cases-jars/jtetris/*:../tools-jars/evosuite/*:../tools-jars/junit/* evosuite-tests/org/jtetris/models/elements/*.java

java -cp evosuite-tests/:../cases-jars/jtetris/*:../tools-jars/evosuite/*:../tools-jars/junit/* -javaagent:../tools-jars/ocov/ocov.jar=org.jtetris.models.elements,_ESTest org.junit.runner.JUnitCore  org.jtetris.models.elements.S_ESTest  

java -jar ../tools-jars/ocov/ocov.jar -a ./oocov-coverable-lines.csv -c ./oocov-covered-lines.csv
