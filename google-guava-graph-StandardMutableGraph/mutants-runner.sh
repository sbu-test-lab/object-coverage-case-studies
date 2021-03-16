#!/bin/sh
java -jar ../tools-jars/mu-runner/MuRunner.jar -maven /home/mgh/home-apps/apache-maven-3.6.3 -project ../cases-src/google-guava -module guava -src-dir /src/ -tests evosuite-tests -jars ../tools-jars/evosuite -jars ../tools-jars/junit -jars ../tools-jars/google-guava

