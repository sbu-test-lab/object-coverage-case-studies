#!/bin/sh
java -jar ../tools-jars/mu-runner/MuRunner.jar -maven /home/mgh/home-apps/apache-maven-3.6.3 -project ../cases-src/ta4j -module ta4j-core -tests evosuite-tests -jars ../tools-jars/evosuite -jars ../tools-jars/junit -jars ../tools-jars/ta4j org.ta4j.core.indicators.MACDIndicator_ESTest 

