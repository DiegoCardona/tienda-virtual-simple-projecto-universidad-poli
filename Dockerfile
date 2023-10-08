FROM maven:3.6.3-openjdk-17 AS build
WORKDIR /oferton
COPY . /oferton
RUN mvn clean package -DskipTests

FROM openjdk:17-alpine
RUN apk update && apk add bash
CMD /bin/bash
WORKDIR /oferton
COPY --from=build /oferton/target/oferton-0.0.1-SNAPSHOT.jar /oferton/oferton-0.0.1-SNAPSHOT.jar
COPY --from=build /oferton/wait-for-it.sh /wait-for-it.sh
ENTRYPOINT ["/wait-for-it.sh", "db:3306", "--", "java", "-jar", "oferton-0.0.1-SNAPSHOT.jar"]
