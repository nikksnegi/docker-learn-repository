FROM openjdk:11-slim as build
MAINTAINER eazybytes.com
COPY target/dipanshu-0.0.1-SNAPSHOT.jar dipanshu-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/dipanshu-0.0.1-SNAPSHOT.jar"]


