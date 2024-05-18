```java
...
//fluxo de entrada de arquivo
FileInputStream fis = new FileInputStream("lorem.txt");
InputStreamReader isr = new InputStreamReader(fis);
BufferedReader br = new BufferedReader(isr);
```
> Aqui se estabeleceu uma entrada, um arquivo com a classe `FileInputStream`. E nao so isso, melhoramos a leitura para ler uma linha inteira, transformando os bytes em caracteres atraves da classe `InputStreamReader`. E por ultimo utilizamos a classe `BufferedReader` para juntar varios caracteres em uma linha, deixando possivel a leitura. <br>
> Reparar que: a referencia criada `fis` que aponta para o objeto `FileInputStream` para o construtor do objeto `InputStreamReader`. A mesma coisa com o `BufferedReader`, que recebe a referencia `isr` para o construtor. <br>
- Esse tipo de algorio é chamado de **Decorator**. Ele é um padrao de projeto que permite adicionar novas funcionalidades a um objeto existente sem alterar sua estrutura. <br>


### Stream
- **Stream**: categoria que consegue ler o fluxo de bytes de dados. <br>
- Outro detalhe: a classe `InputStream` que representa a ideia de ter uma entrada binaria de dados. <br>
- Essa classe (`InputStream`), por representar uma ideia/conceito e abstrata. 
- Dessa forma, usamos uma classe mais *especifica* para representar a entrada de dados binarios de um arquivo: `FileInputStream`. <br>
### Reader
- **Reader**: categoria que consegue ler o fluxo de caracteres de dados. <br>
- A mesma logica das classes `InputStream` e `BufferedReader`, a classe `Reader` é abstrata e representa a ideia de ter uma entrada de dados de caracteres. <br>
- Onde a classe mais *concreta* `InputStreamReader` tem o foco de transformar os bytes em caracteres e a classe `BufferedReader` tem o foco de juntar varios caracteres em uma linha. Mas em geral, ele SAO `Reader`s. <br>

# Refatorando..
- Por termos uma abstração de `Reader` e `InputStream`, podemos refatorar o codigo para que ele fique mais generico. <br>
- Assim, podemos trocar o `FileInputStream` por `InputStream` e `InputStreamReader` por `Reader`. <br>
- Dessa forma, o codigo fica mais generico e podemos trocar o tipo de entrada de dados sem alterar a estrutura do codigo. <br>
- Bem como tambem o `BufferedReader` por `Reader`. POREM, a classe `Reader` nao tem o metodo `readLine()`, assim nao podemos instanciar a referencia `br` definindo que o tipo dela seja `Reader`<br>
- **Exemplo**: 
```java
InputStream is = new FileInputStream("lorem.txt");
Reader isr = new InputStreamReader(is);
BufferedReader br = new BufferedReader(isr);
...
```