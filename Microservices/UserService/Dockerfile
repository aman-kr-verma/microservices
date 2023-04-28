FROM openjdk
COPY target/user-service.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8081
CMD ["java", "-jar", "user-service.jar"]