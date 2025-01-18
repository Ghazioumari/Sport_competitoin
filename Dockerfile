# Utiliser une image Java 17 plus récente et maintenue
FROM eclipse-temurin:17-jre-alpine

# Définir le répertoire de travail
WORKDIR /opt/app

# Copier le JAR avec le bon nom (basé sur votre pom.xml)
COPY target/GQ-Sport_competitoin-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port 8080 utilisé par Spring Boot
EXPOSE 8080

# Commande de démarrage
ENTRYPOINT ["java", "-jar", "app.jar"]
