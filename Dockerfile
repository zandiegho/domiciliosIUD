FROM java11
EXPOSE 8080
ADD domiciliosIUD-0.0.1-SNAPSHOT.jar domiciliosIUD.jar
ENTRYPOINT[java, -jar, domiciliosIUD.jar]



