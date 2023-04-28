FROM openjdk
COPY target/service-registry.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8761
CMD ["java", "-jar", "service-registry.jar"]