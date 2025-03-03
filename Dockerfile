FROM  maven:3.8.6-eclipse-temurin-17-alpine AS maven_build

COPY src /home/app/src
COPY pom.xml /home/app

ENV APP_HOST=java_iot

RUN mvn -f /home/app/pom.xml clean package -P docker -D maven.test.skip

FROM  eclipse-temurin:17-jre-alpine

COPY --from=MAVEN_BUILD /home/app/target/*.war /usr/local/lib/app.war
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=docker","-jar", "/usr/local/lib/app.war"]