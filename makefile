
#
#@Author Broderick DeSantis
#@version coffee 1.0

JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default:
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: Matrix.java Testrix0.java
#	javac -cp .:$(JUNIT_JAR) Testrix0.java
	javac Matrix.java Testrix0.java

clean:
	rm -f Matrix.class
	rm -f Testrix0.class

test: Matrix.class Testrix0.class
	java -cp .: $(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore Testrix0
