# language: pt

Funcionalidade: Buscar a versão da aplicação

Cenario: Cliente faz uma chamada para /version para receber a versão da aplicação
Quando o cliente chama /versao
Então o cliente recebe o status code 200
E a versao 1.0.0

Cenario: Cliente faz uma chamada para /version/too para receber a versão da aplicação
Quando o cliente chama /versao/too
Então o cliente recebe o status code 200
E a versao 2.0.0