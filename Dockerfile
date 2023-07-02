FROM opentjdk:17.0.5
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-batch-processing.jar
ENTRYPOINT ["java",".jar","/spring-batch-processing.jar"]
EXPOSE 9191