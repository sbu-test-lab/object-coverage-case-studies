javac -cp ../cases-jars/ta4j/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/org/ta4j/core/indicators/*.java

java -cp evosuite-tests/;../cases-jars/ta4j/*;../tools-jars/evosuite/*;../tools-jars/junit/*  org.junit.runner.JUnitCore org.ta4j.core.indicators.RSIIndicator_ESTest 

pause
