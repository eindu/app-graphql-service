FROM ubuntu:24.04
RUN MKDIR -p /opt/app-graphql/prop
ADD /target/app-graphql-service-1.0.1.jar /opt/app-graphql/app-graphql-service-1.0.1.jar
ADD /target/classes/application.properties /opt/app-graphql/application.properties
ENTRYPOINT ["java","-Dspring.config.location=/opt/app-graphql/application.properties","-jar","/opt/app-graphql/app-graphql-service-1.0.1.jar"]
