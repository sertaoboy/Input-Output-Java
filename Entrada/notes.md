# java.io
- Como na maioria das aplicacoes atualmente exigem um fluxo de entrada de dados e um fluxo de saida, a API java.io fornece classes para lidar com esses fluxos.
- "java.Input&Output"
- E o que de fato pode ser essa entrada?
* Formas de entrada:
  * Teclado
  * Rede (streaming,etc)
  * Arquivos

- Isso vale para saida:
* Formas de saida:
  * Console
  * Rede
  * Arquivos

# Explicacao do `TesteLeitura.java`
```java
//Fluxo de entrada com arquivo;
FileInputStream fis = new FileInputStream("texto.txt");
InputStreamReader isr = new InputStreamReader(fis);
BufferedReader br = new BufferedReader(isr);
```
- Acima, se establece uma entrada baseado em um <strong>arquivo</strong> chamado `texto.txt`.
- `InputStreamReader` classe que transforma os bites em caracteres;
- `BufferedReader` classe que le e junta os caracteres.
- Em resumo, o `BufferedReader` le a linha, que por sua vez pede para o `InputStreamReader` transformar os bites em caracteres, que por sua vez pede para o `FileInputStream` ler os dados do `texto.txt`
- "PADRAO DE PROJETO, chamado <strong>'Decorator' </strong>; um objeto esta decorando a funcionalidade de um outro objeto. Sempre adicionando/melhorando um comportamento"

## Diferenca entre `Stream` e `Reader/Writer`
- `Stream` trabalha com bytes, `Reader/Writer` trabalha com caracteres.
- ~`Stream` e `Reader/Writer` sao interfaces, `InputStream` e `OutputStream` sao classes concretas.~ <storng>ERRADO</strong>
- `InputStream` na verdade e uma classe abstrata onde `FileInputStream` herda desta
- Logo, `InputStreamReader` e uma classe mais concreta, que tambem herda de sua superclasse: <strong>`Reader`</strong>. POREM, notar que se substituir a classe filha pela mae, ha problemas com o metodo `.readLine()`
- Bem como `BufferedReader` extende de <strong>`Reader`</strong>
- Quando se trabalha com caracteres, e melhor usar `Reader/Writer` pois eles ja fazem a conversao de bytes para caracteres.
- `Reader/Writer` sao mais lentos que `Stream`, pois fazem a conversao de bytes para caracteres.
- Quando se trabalha com bytes, e melhor usar `Stream` pois sao mais rapidos.
- <strong>Porem, ambas as classes tem algo em comum, elas sao "Readers"

# Refatorando o codigo de uma maneira mais "generica"
```java
public class TesteLeitura {
  public void static main (String [] args) {
    InputStream fis = new FileInputStream("texto.txt");
    Reader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);

    String linha = br.readLine();

    while(linha!=null){
      System.out.println(linha);
      linha = br.readLine();
    }
    br.close();
  }
}
