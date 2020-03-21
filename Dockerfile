FROM openjdk:8
ADD target/docker-workshop-flairstech-eraqi.jar flairstech-task.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "flairstech-task.jar"]