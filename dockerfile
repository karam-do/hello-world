FROM openjdk:8-jdk-alpine

ADD /target/helloworld-0.0.1-SNAPSHOT.jar /

EXPOSE 8080

CMD ["bin/sh", "-c", "java -jar helloworld-0.0.1-SNAPSHOT.jar"]