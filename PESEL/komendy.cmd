cd source/lab01a
javac -d ../.. *.java
cd ../../
jar -cvmf manifest.txt test.jar lab01a/*.class
javadoc -d doc source/lab01a/*
java -jar test.jar