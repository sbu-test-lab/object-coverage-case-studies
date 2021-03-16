#!/bin/sh
javac -cp ../tools-jars/apache-commons-bcel/*:../tools-jars/evosuite/*:../tools-jars/junit/* evosuite-tests/org/apache/bcel/classfile/*.java

java -cp evosuite-tests/:../cases-jars/apache-commons-bcel/*:../tools-jars/evosuite/*:../tools-jars/junit/*  org.junit.runner.JUnitCore org.apache.bcel.classfile.EnumElementValue_ESTest
