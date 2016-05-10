# simple-rest-imc
Projeto REST com java para calculo de IMC.

Para acessar a documentação da API, acesse a url:"editor.swagger.io" e copie o conteúdo do arquivo "api.json"

O sistema foi implementado em java usando Spring Boot. Foi usado o modelo de JSON para a troca de mensagens através da arquitetura RESTful.

O calculo do IMC esta temporariamente disponivel atraves da seguinte url: http://aviator1.cloudapp.net/imc/calcular
Uma mensagem no formato JSON deve ser passada no corpo da requisiçao com o metodo POST.
Um exemplo de mensagem pode ser visto a seguir:
  
  {
    "peso": 80.0,
    "altura": 1.87
  }
  
  ou
  
  {
    "altura": 1.87,
    "peso": 80.0
  }
  
A ordem dos parametros nao importa.
