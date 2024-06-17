# Etapa 1: Construir o aplicativo com GraalVM
FROM ghcr.io/graalvm/graalvm-ce:ol8-java21-22.3.0 AS build

# Instalar o Native Image
RUN gu install native-image

# Copiar o código-fonte para a imagem
COPY . /app

WORKDIR /app

# Compilar o aplicativo usando o Maven
RUN ./mvnw clean package -Pnative -DskipTests

# Etapa 2: Criar a imagem mínima para execução do aplicativo
FROM frolvlad/alpine-glibc:alpine-3.12

# Copiar o binário nativo compilado para a imagem final
COPY --from=build /app/target/your-app-name /your-app-name

# Expor a porta que o aplicativo irá utilizar
EXPOSE 8080

# Executar o aplicativo
ENTRYPOINT ["/your-app-name"]
