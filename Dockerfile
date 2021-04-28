FROM openjdk:8
EXPOSE 8080
ADD target/automatedCICD.jar automatedCICD.jar
ENTRYPOINT ["java","-jar","/automatedCICD.jar"]