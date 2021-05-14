FROM openjdk:15
ADD ./target/money-lenders.jar money-lenders.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","money-lenders.jar"]