FROM openjdk:18

COPY ./build/libs/vendas-ecommerce-0.0.1-SNAPSHOT.jar vendas-ecommerce-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "vendas-ecommerce-0.0.1-SNAPSHOT.jar"]