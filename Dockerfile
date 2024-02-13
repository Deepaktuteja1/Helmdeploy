FROM openjdk:17-jdk
COPY target/springhelm.jar .

ENTRYPOINT ["java","-jar","springhelm.jar"]

