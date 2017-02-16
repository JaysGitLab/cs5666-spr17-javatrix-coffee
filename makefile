
#
#@Author Broderick DeSantis
#@version coffee 1.0

JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default:
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: Matrix.java Tests/Testrix.java
#	javac -cp .:$(JUNIT_JAR)Tests/Testrix.java
	javac Matrix.java Tests/Testrix.java

clean:
	rm -f *.class 
	rm -f Tests/*.class

test: Matrix.class Tests/Testrix.class
	java -cp .: $(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore Tests/Testrix0
