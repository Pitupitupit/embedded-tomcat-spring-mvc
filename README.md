### Embedded tomcat 10 with spring web mvc 6
Dumb example showing how to use embedded tomcat 10 with spring webmvc 6 without spring boot.

Tomcat has JSP servlet turned off for simplicity (requires less dependencies).

### How to run?

1. Make jar ``./gradlew -jar``
2. Run it ``java -jar build/libs/embedded-tomcat-spring-mvc-0.0.1-SNAPSHOT.jar``
3. Check controller ``curl localhost:8080``

Or click play button in Intellij.