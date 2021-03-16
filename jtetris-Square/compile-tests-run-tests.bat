javac -cp ../cases-jars/jtetris/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/org/jtetris/models/elements/*.java

java -cp evosuite-tests/;../cases-jars/jtetris/*;../tools-jars/evosuite/*;../tools-jars/junit/*  org.junit.runner.JUnitCore org.jtetris.models.elements.Square_ESTest 

pause
