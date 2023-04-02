![image](https://user-images.githubusercontent.com/26327049/228422772-f199af9f-47c1-43db-a73a-308637ace0f7.png)

<h3> Projeto Imersão Java ☕ </h3>

---

![Status](https://img.shields.io/static/v1?label=STATUS&message=FINALIZADO&color=GREEN&style=for-the-badge)



<p>A aplicação <b>alura-stickers</b> tem como principal funcionalidade gerar stickers que podem, por exemplo, ser compartilhados no whatsapp. Enquanto o projeto Spring - <b>linguagens.api</b> - a principal funcionalidade é o CRUD (Create, Read, Update and Delete) das principais linguagens de programação escolhidas. Meu objetivo em participar do projeto foi a revisão de conceitos e recursos do mundo Java, estudar e ampliar meus conhecimentos! 😄</p>


##  🗒️ Índice

* [Descrição do Projeto](#descricao-do-projeto)
* [Como executar](#como-executar)
* [[Aula 1] - Consumindo uma API de Filmes com Java](#aula-1)
* [[Aula 2] - Gerando Figurinhas para Whatsapp](#aula2)
* [[Aula 3] - Ligando as Pontas, Refatoração e Orientação a Objetos](#aula3)
* [[Aula 4] - Criando nossa própria API com Spring](#aula4)
* [[Aula 5] - Publicando nossa API no Cloud](#aula5)
* [Tecnologias](#tecnologias)
* [Agradecimento](#agradecimento)

 <h2>✏️ Descrição do Projeto</h2><a name = "descricao-do-projeto"></a>

<p>A cada aula foi desenvolvido uma parte do sistema que envolveu: conceitos de Orientação a Objetos, Java, API REST, Bibliotecas (como exemplo: Java Awt, Java Io, Java Util), Ecossistema Spring e Cloud.</p>

<h2> 🎯 Como executar </h2><a name = "como-executar"></a>

Na linha de comando execute:

```bash

# Clone o repositório
$ git clone https://github.com/vgerace/imersaojavastickers

[Spring]

# Entre no diretório
$ cd imersaojavastickers/target

# Execute o comando abaixo para startar o app
$ java -jar linguagens.api-0.0.1-SNAPSHOT.jar

[Java]

# Entre no diretório
$ cd alura-stickers/src

# Escolha na classe App a API que prefira (disponíveis da NASA e IMDB)
# Ajuste a key com as variáveis de ambiente de acordo com sua IDE/OS, no exemplo: (nasaApiKey, imdbApiKey...)
$ Execute a classe APP

```

<h2> Aula 1 - Desafios </h2><a name = "aula-1"></a>

- [x] Consumir o endpoint de filmes mais populares da API do IMDB. Além de também, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
- [x] Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!
- [x] Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente..

![Desafio01_2](https://user-images.githubusercontent.com/26327049/229339838-b4e2d549-18b8-4002-8332-b32a9232c8e8.png)

<h2> [Aula 2] - Desafios </h2><a name = "aula2"></a>

- [x] Criar diretório de saída das imagens, se ainda não existir.
- [x] Centralizar o texto na figurinha.
- [x] Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
- [x] Colocar contorno (outline) no texto da imagem.
- [x] Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
- [x] Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha e fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.!

![image](https://user-images.githubusercontent.com/26327049/229340377-bb05a7a0-41d7-4268-942e-008f3956ad65.png)

<h2> [Aula 3] - Desafios </h2><a name = "aula3"></a>

- [x] Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16.
- [x] Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP.
- [x] Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra. 
- [x] Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado.

<h2> [Aula 4] - Destaque </h2><a name = "aula4"></a>

- [x] CRUD
- [x] Criação de collection utilizando Mongo Db Cloud

![image](https://user-images.githubusercontent.com/26327049/229343506-f8aca9db-d172-4abb-8c54-23a19a6a464a.png)

![image](https://user-images.githubusercontent.com/26327049/229343617-fcdbef4d-2e47-4439-ab1c-47b237b64c3a.png)

![image](https://user-images.githubusercontent.com/26327049/229342936-6336121c-db4d-44d0-bf75-f04471271e58.png)


<h2> [Aula 5] - Destaque </h2><a name = "aula5"></a>

- [x] Deploy
- [x] Adicionalmente, foi criado dockerfile e imagem docker
- [x] Adicionalmente, foi implementado o Swagger para documentação da API

API disponível em: https://imersaojavastickers-production.up.railway.app/linguagens

![image](https://user-images.githubusercontent.com/26327049/229342859-a5039e84-2b89-4110-b882-eca5e1618756.png)

Imagem Dcoker disponível em: https://hub.docker.com/r/geracevitor/linguagensapi/

Swagger Ui - Index.html

![image](https://user-images.githubusercontent.com/26327049/229374908-2e27a23a-5928-45eb-8826-139c41b88cdb.png)




<h2>⚙️ Tecnologias</h2><a name = "tecnologias"></a>
<ul>
<li>[Java-JDK] (https://www.oracle.com/java/technologies/downloads/)</li>
<li>[Maven] (https://maven.apache.org/download.cgi)</li>
<li>[Spring Boot] (https://start.spring.io/)</li>
<li>[Docker] (https://www.docker.com/)</li>
<li>[Railway] (https://railway.app/)</li>
<li>[Mongo Db Atlas] (https://www.mongodb.com/cloud/atlas/register)</li>
<li>[Swagger] (https://swagger.io/)</li>
</ul>

<h2>👏🏾 Agradecimento</h2><a name = "agradecimento"></a>
<p> Quero registrar meu agradecimento a todos envolvidos da equipe Alura e sua comunidade, que impulsionaram e colaboraram para a realização desse projeto. Em especial também ao meu colega e amigo @Durval Printes, por sempre se dispor a colaborar em dúvidas, compartilhar conhecimento e incentivar a nos tornarmos profissionais/devs melhores!</p>

