javac -cp ../cases-jars/google-guava/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/com/google/common/graph/*.java

java -cp evosuite-tests/;../cases-jars/google-guava/*;../tools-jars/evosuite/*;../tools-jars/junit/*  org.junit.runner.JUnitCore com.google.common.graph.StandardMutableValueGraph_ESTest

pause
