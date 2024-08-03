
<h3 align="center">
  GraalVM e Spring Boot na prática!Exemplo de aplicação usando compilação nativa com a nova VM Cloud-Native
</h3>

<p align="center">
  <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-%2304D361">
  <img alt="Language: Java" src="https://img.shields.io/badge/language-java-green">
  <img alt="Version: 1.0" src="https://img.shields.io/badge/version-1.0-yellowgreen">
</p>

## Como compilar o seu código para a GraalVM?

```bash
mvn clean -Pnative native:compile
```

## Problemas Comuns

### Executável compilado não detecta classes que utilizam "Reflections"

1. Execute o seu projeto dentro da JVM com a seguinte VM Option:
```VM Option
-agentlib:native-image-agent=config-output-dir=src/main/resources/META-INF/native-image
```
2. Após a aplicação subir, execute um teste funcional (fluxo de sucesso e erro) para que o profiling detecte os possíveis caminhos da aplicação
3. Após os seus testes, pode parar o projeto, será gerado um profiling neste caminho `/src/main/resources/META-INF/native-image` para a GraalVM
4. Execute o mesmo comando de compilação nativa novamente para recompilar utilizando as informações de profiling!


## Tecnologias utilizadas
* Java 22
* Spring Boot
* GraalVM

Baixe o projeto e teste você mesmo na prática.
