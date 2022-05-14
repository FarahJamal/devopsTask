FROM maven:3.8.2-jdk-8
WORKDIR /read_data
COPY . .
RUN mvn clean install -Dmaven.clean.failOnError=false
CMD mvn spring-boot:run
