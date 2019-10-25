FROM mcr.microsoft.com/java/jdk:8u192-zulu-alpine

RUN apk update && apk add curl bash tree tzdata && cp -r -f /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

WORKDIR /app
COPY ./target/microservice-demo-0.0.1-SNAPSHOT.jar /app

EXPOSE 80

CMD ["java", "-jar", "/app/microservice-demo-0.0.1-SNAPSHOT.jar"]
