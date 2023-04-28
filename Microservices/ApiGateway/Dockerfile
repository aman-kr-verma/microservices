FROM openjdk
COPY target/api-gateway.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8084
CMD ["java", "-jar", "api-gateway.jar"]
