# Microsserviço Procedimento

##  Objetivo 
Microsserviço responsável de cuidar das chamadas necessárias da tela principal

## Rodando a aplicação e testando

1° Baixe o repositório em sua máquina entre na pasta onde está o arquivo docker-compose.yml e rode o seguinte comando:
```bash
    $ docker-compose -d up
```
2 Para poder rodar o container rode esse comando:
```bash
    $ docker run -p 8080:8080 arthurneves0512/procedure
```
3° chame o endpoint no seu browser <br>
https:localhost:8080/hello-world

Para consultar os endpoints, basta acessar nosso Swagger: http://localhost:8080/swagger-ui/index.html


