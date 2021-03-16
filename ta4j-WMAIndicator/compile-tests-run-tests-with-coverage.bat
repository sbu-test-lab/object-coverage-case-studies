javac -cp ../cases-jars/ta4j/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/org/ta4j/core/indicators/*.java

java -cp evosuite-tests/;../cases-jars/ta4j/*;../tools-jars/evosuite/*;../tools-jars/junit/*; -javaagent:../tools-jars/ocov/ocov.jar=org.ta4j.core.indicators,_ESTest  org.junit.runner.JUnitCore org.ta4j.core.indicators.WMAIndicator_ESTest 

java -jar ../tools-jars/ocov/ocov.jar

pause
