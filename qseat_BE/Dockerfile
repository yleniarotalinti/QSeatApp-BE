#BUILD
FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY . ./
RUN mvn -f pom.xml clean install

FROM openjdk:8-jdk-alpine
COPY --from=build /app/target/*.jar BE_qseat.jar
ENTRYPOINT ["java","-jar","BE_qseat.jar", "--spring.profiles.active=prod"]