javac -cp ../cases-jars/apache-commons-collections/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/org/apache/commons/collections4/map/*.java

java -cp evosuite-tests/;../cases-jars/apache-commons-collections/*;../tools-jars/evosuite/*;../tools-jars/junit/*  org.junit.runner.JUnitCore org.apache.commons.collections4.map.StaticBucketMap_ESTest 

pause
