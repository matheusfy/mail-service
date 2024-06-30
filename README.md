# Email Service

O intuito deste serviço é ter um serivço de email para nos redirecionar o 

## Configuração

Para configurar o projeto, é necessário definir algumas variáveis de ambiente. Copie o arquivo `.env.example` para um novo arquivo chamado `.env` e preencha os valores conforme necessário.

Exemplo de `.env.example`:

```plaintext
MAIL_USERNAME=<smtp username>
MAIL_PASSWORD=<credencial para autenticação smtp>
SMTP_HOST=<host smtp>
SMTP_PORT=<port smtp>
SITE_ADDRESS=<client address> -> Endereço do cliente que está liberado para acessar nossa aplicação
```


## Instalação
Siga os passos abaixo para configurar o ambiente de desenvolvimento:

1. Clone o repositório.
2. Abra o projeto com a IDE de sua escolha.
3. Instale as dependências.
   1. Neste caso estamos utilizando o Gradle. Dê um `./gradlew build` ou `Ctrl + Shift + P -> Gradle build -> build` caso esteja no vscode.
4. Configure as variáveis de ambiente conforme descrito na seção Configuração.
5. Rode o projeto e verifique se está tudo configurado adequadamente.

## Uso: 
Explique como usar o projeto, incluindo exemplos de comandos ou ações que os usuários podem realizar.

```plaintext
Envie uma requisição POST no endpont "/email" com o seguinte corpo:
{
    "to": "",
    "from": "",
    "name": "",
    "subject": "",
    "body": ""
}
```
