# fatec

## C.R.U.D -  Criado para palestra apresentada na FATEC de Praia Grande - SP

### Configurando o ambiente
Para configurar o ambiente precisa  instalr o JDK, acima da versao 11.<br>
É necessário também o maven (efeutar donwload, e decompactar em uma pasta).<br>
Configurar as variaveis de ambiente para o JAVA_HOME e MAVEN_HOME.<br>
Instalar o lombok.<br>
Para esses passos acima temos exemplos na internet.<br>

### Para subir a aplicação.
Clique na classe "FatecServiceMainApplication" com o botão direito. <br>
Ir em "Run As". <br>
E clique em "Java Application". <br>

### Para simular o front-end.
Simulamos o front-end pelo swagger para inserir, ler, alterar ou apagar dados através de requisições na aplicação back-end.<br>
Após subir a aplicação entre no seu navegador e cole o seguinte endereço abaixo.<br>
link: http://localhost:8050/fatec/swagger-ui.html.<br>

### Banco H2
Para acessar o banco utilizado na palestra, ir no browser e digitar:<br>
http://localhost:8050/fatec/h2-console<br>
Na janela que ira abrir no campo "JDBC Url" digite:<br>
jdbc:h2:mem:test<br>
E clique no "botão" Connect.<br>

### Especificações da aplicação
Java 11<br>
API REST<br>
Spring Boot<br>
H2<br>
JPA<br>
Hibernate<br>
Arquitetura MVC<br>
Swagger<br>



