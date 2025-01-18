# Utilisation de l'image de base Java 17
FROM openjdk:17-jdk-slim

# Définition du répertoire de travail
WORKDIR /app

# Copie du fichier JAR de l'application
COPY target/*.jar app.jar

# Port exposé par l'application
EXPOSE 8082

# Commande pour démarrer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
