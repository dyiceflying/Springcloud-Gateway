FROM registry.daocloud.cn/openapi/alpine-java:8
COPY target/glmapper-cloud-gateway-0.0.1-SNAPSHOT.jar /work/app.jar
COPY src/main/resources/application.yml /work/config/application.yml

#RUN mkdir -p /work/conf && echo "configPath=/work/config" > /work/conf/configPath.conf
WORKDIR /work
#EXPOSE 8077
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-classpath","lib/*.jar","-jar","app.jar"]
CMD ["-Xmx512M","-Xms256M","-Xmn192M","-XX:MaxMetaspaceSize=192M","-XX:MetaspaceSize=192M"]

