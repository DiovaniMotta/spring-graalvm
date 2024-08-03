
<h3 align="center">
  Exemplo de aplicação usando compilação nativa com a nova VM Cloud-Native da Oracle, a GraalVM
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


## Como configurar o ambiente de desenvolvimento para executar compilações nativas no Windows 11

Este guia descreve como configurar o ambiente de desenvolvimento para compilar aplicações Java utilizando GraalVM no Windows 11.

## Pré-requisitos

- Windows 11
- Acesso a linha de comando (Prompt de Comando ou PowerShell)

## Passo a Passo

### 1. Baixar e Instalar o GraalVM

1. Acesse o site oficial do [GraalVM](https://www.graalvm.org/downloads/).
2. Baixe a versão mais recente do GraalVM para Windows (por exemplo, `graalvm-ce-java11-windows-amd64-XX.X.X.zip`).
3. Extraia o conteúdo do arquivo `.zip` para um diretório de sua escolha, como `C:\graalvm`.

### 2. Configurar Variáveis de Ambiente

1. Abra o menu Iniciar, procure por "Variáveis de Ambiente" e selecione "Editar as variáveis de ambiente do sistema".
2. Na janela "Propriedades do Sistema", clique no botão "Variáveis de Ambiente...".
3. Em "Variáveis de sistema", clique em "Novo..." para adicionar uma nova variável.
    - Nome da variável: `JAVA_HOME`
    - Valor da variável: `C:\graalvm\graalvm-ce-java11-XX.X.X` (substitua pelo caminho onde você extraiu o GraalVM)
4. Encontre a variável `Path` em "Variáveis de sistema" e clique em "Editar...".
5. Adicione o seguinte caminho ao final da lista de variáveis de `Path`:
    - `%JAVA_HOME%\bin`

### 3. Verificar a Instalação

1. Abra o Prompt de Comando ou PowerShell.
2. Execute o comando:
    ```sh
    java -version
    ```
   Você deve ver a versão do GraalVM instalada.

### 4. Instalação do Visual Studio Build Tools e SDK do Windows 11

### Visual Studio

1. Faça o download do Visual Studio Build Tools 2022 (ambiente de desenvolvimento C) versão 17.1.0 ou posterior no site [visualstudio.microsoft.com](https://visualstudio.microsoft.com).

2. Inicie a instalação do Visual Studio Build Tools clicando no arquivo .exe baixado e, em seguida, clique em **Continuar**:

   ![Início da Instalação do Visual Studio Build Tools](https://miro.medium.com/v2/resize:fit:640/format:webp/1*QO2VoPS02BE8jlwXBEUWIw.png)

3. Selecione a caixa de seleção **Desenvolvimento para desktop com C++** na janela principal. Além disso, no lado direito, em **Detalhes da Instalação**, selecione **SDK do Windows 11** e clique em **Instalar**.

   ![Desenvolvimento para desktop com C++ e SDK do Windows 11](https://miro.medium.com/v2/resize:fit:720/format:webp/1*i2PODj-b1IlApEjxXYDK3w.png)

4. Após a conclusão da instalação, reinicie o seu sistema.

### SDK do Windows 11

Se você já possui o Visual Studio 2022 instalado, será necessário garantir que o SDK do Windows 11 também esteja disponível:

1. Abra o Instalador do Visual Studio:

   ![Instalador do Visual Studio](https://miro.medium.com/v2/resize:fit:522/format:webp/1*RV90BO3O8X9JqrRw6-jhJA.png)

2. Na guia **Instalado**, clique em **Modificar** e escolha **Componentes Individuais**:

   ![Instalador do Visual Studio - Modificar](https://miro.medium.com/v2/resize:fit:720/format:webp/1*LYXkCjAALmHhE7b4_mnN8g.png)

3. Role até o final e verifique se o SDK do Windows 11 está instalado e confirme se as ferramentas de build estão instaladas.

Agora você pode começar a usar o GraalVM Native Image.

Para maiores detalhes, acesse a [documentação oficial](https://www.graalvm.org/22.3/docs/getting-started/windows/).


Baixe o projeto e teste você mesmo na prática.
