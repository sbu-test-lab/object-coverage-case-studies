javac -cp ../cases-jars/apache-validator/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/org/apache/commons/validator/routines/*.java

java -cp evosuite-tests/;../cases-jars/apache-validator/*;../tools-jars/evosuite/*;../tools-jars/junit/* -javaagent:../tools-jars/ocov/ocov.jar=org.apache.commons.validator.routines,_ESTest  org.junit.runner.JUnitCore org.apache.commons.validator.routines.PercentValidator_ESTest

java -jar ../tools-jars/ocov/ocov.jar

pause
