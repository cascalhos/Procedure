FROM openjdk:17-jdk-slim
COPY build/libs/procedure.jar teste.jar
ENTRYPOINT ["java", "-jar", "teste.jar"]