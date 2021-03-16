#!/bin/sh
javac -cp ../cases-jars/apache-commons-bcel/*:../tools-jars/evosuite/*:../tools-jars/junit/* evosuite-tests/org/apache/bcel/classfile/*.java

java -cp evosuite-tests/:../cases-jars/apache-commons-bcel/*:../tools-jars/evosuite/*:../tools-jars/junit/*  org.junit.runner.JUnitCore org.apache.bcel.classfile.Method_ESTest
