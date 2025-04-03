FROM openjdk:21-jdk-slim
WORKDIR /sampleapp
COPY target/JenkinsDevopsExample-0.0.1-SNAPSHOT.jar dockerimage.jar
EXPOSE 9876
ENTRYPOINT [ "java", "-jar", "dockerimage.jar" ]