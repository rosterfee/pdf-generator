FROM maven:3.6.0-jdk-8-slim AS build
COPY src /home/application/src
COPY ../pom.xml /home/application
USER root
RUN --mount=type=cache,target=/.m2 mvn -f /home/application/pom.xml clean package -DskipTests=true

FROM openjdk:11-jre-slim
COPY --from=build /home/application/target/pdf-generator.jar /usr/local/lib/pdf-generator.jar
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "/usr/local/lib/pdf-generator.jar"]