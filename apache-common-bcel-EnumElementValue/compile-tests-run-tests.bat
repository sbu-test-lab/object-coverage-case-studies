javac -cp ../cases-jars/apache-common/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/org/apache/bcel/classfile/*.java

java -cp evosuite-tests/;../tools-jars/apache-common/*;../tools-jars/evosuite/*;../tools-jars/junit/*  org.junit.runner.JUnitCore org.apache.bcel.classfile.EnumElementValue_ESTest 

pause
