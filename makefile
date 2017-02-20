
#
#@Author Broderick DeSantis
#@version coffee 1.0


#JUNIT_JAR = /usr/share/java/junit-4.10.jar
#HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

JUNIT_JAR = junit-4.12.jar
HAMCREST_JAR = hamcrest-core-1.3.jar


default:
	@echo "usage: make target"
	@echo "available targets: compile, test, clean, checkstyle"

compile: Matrix.java Tests.java
	javac -cp .:$(JUNIT_JAR) Tests.java Matrix.java
	#javac Matrix.java Tests.java

clean:
	rm -f *.class
	rm -f *.log 

test: Matrix.class Tests.class
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore Tests


checkstyle: Matrix.java Test.java
	checkstyle *.java > checkstyle.log	
