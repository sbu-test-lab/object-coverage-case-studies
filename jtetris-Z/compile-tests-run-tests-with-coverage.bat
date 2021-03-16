javac -cp ../cases-jars/jtetris/*;../tools-jars/evosuite/*;../tools-jars/junit/* evosuite-tests/org/jtetris/models/elements/*.java

java -cp evosuite-tests/;../cases-jars/jtetris/*;../tools-jars/evosuite/*;../tools-jars/junit/* -javaagent:../tools-jars/ocov/ocov.jar=org.jtetris.models.elements,_ESTest  org.junit.runner.JUnitCore org.jtetris.models.elements.Block_ESTest

java -jar ../tools-jars/ocov/ocov.jar

pause
