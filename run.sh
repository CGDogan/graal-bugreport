javac org/Test.java
java org.Test
java -agentlib:native-image-agent=config-output-dir=META-INF/native-image org.Test
native-image org.Test
./org.test
