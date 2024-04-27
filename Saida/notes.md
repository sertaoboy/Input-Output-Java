# Saida de dados
- Uma vez entendido o exemplo de entrada, `InputStream`, sendo uma classe mae que extende para outras classes, <strong>`OutputStream`</strong> tambem se encontra na mesma situacao.
- O mesmo vale para a classe abstrata <strong>`Writer`</strong>. Semelhante a classe generica `Reader`.
- Lembrando: `FileInputStream` herda de `InputSteam`;
- `InputStreamReader` e `BufferedReader` herda de `Reader`
- O mesmo acontece para a saida de dados, ou no minimo semelhante:
- Veja: <strong>`FileOutputStream`</strong> e uma classe que herda de <strong>`OutputStream`</strong>
- Bem como: <strong>`OutputStreamWriter`</strong> e <strong>`BufferedWriter`</strong> herda de <strong>`Writer`</strong>
- Recaptulando: lembre-se que `InputStream` e uma classe que trata entrada de dados <strong>binarios</strong>(bytecode). O mesmo vale para `OutputStream`. Um bom exemplo para uso dessas classes seria se voce trabalhasse lendo um relatorio em .pdf ou uma imagem e etc.
