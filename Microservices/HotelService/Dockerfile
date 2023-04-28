FROM openjdk
COPY target/hotel-service.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8082
CMD ["java", "-jar", "hotel-service.jar"]