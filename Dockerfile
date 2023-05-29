FROM openjdk:8-jdk-alphine

EXPOSE 8080

ADD target/DeliveryApp.jar DeliveryApp.jar

ENTRYPOINT ["java","-jar,"DeliveryApp.jar"]