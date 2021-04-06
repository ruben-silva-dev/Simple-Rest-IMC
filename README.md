# Simple Rest IMC
Projeto REST com java para calculo de IMC.

Para acessar a documentação da API, acesse a url:"editor.swagger.io" e copie o conteúdo do arquivo "api.json"

O sistema foi implementado em java usando Spring Boot. Foi usado o modelo de JSON para a troca de mensagens através da arquitetura RESTful.

A aplicação web está disponível temporariamente no seguinte endereço: http://aviator1.cloudapp.net/imc/

A API RESTful para o cálculo do IMC está, também, temporariamente disponível através da seguinte url: http://aviator1.cloudapp.net/imc/calcular . Para acessar a API, uma mensagem no formato JSON deve ser passada no corpo da requisição com o método POST. Um exemplo de mensagem pode ser visto a seguir:
  
  
  ```
  {
    "peso": 80.0,
    "altura": 1.87
  }
  ```
  
  ou
  
  ```
  {
    "altura": 1.87,
    "peso": 80.0
  }
  ```
  
A ordem dos parâmetros não importa.

O retorno, da mesma forma é um JSON com o imc devidamente calculado. Um exemplo do retorno pode ser visto a seguir:

  ```
  {
    "imc": 22.877405702193368
  }
  ```
