FROM openjdk:17-jdk-slim
COPY build/libs/*.jar procedure.jar
ENTRYPOINT ["java", "-jar", "procedure.jar"]