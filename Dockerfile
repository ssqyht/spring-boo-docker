FROM java:8
VOLUME /tmp
ADD ./target/spring-boot-docker.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=test"]