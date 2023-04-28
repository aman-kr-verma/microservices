FROM openjdk
COPY target/rating-service.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8083
CMD ["java", "-jar", "rating-service.jar"]