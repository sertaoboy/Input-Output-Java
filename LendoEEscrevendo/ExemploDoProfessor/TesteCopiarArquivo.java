package LendoEEscrevendo.ExemploDoProfessor;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiarArquivo {
    public static void main (String [] args) throws IOException {  
        FileInputStream fis = new FileInputStream("/home/raul/Desktop/estudosJava/InputOutput/LendoEEscrevendo/ExemploDoProfessor/lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        //entrada

        OutputStream fos = new FileOutputStream("/home/raul/Desktop/estudosJava/InputOutput/LendoEEscrevendo/ExemploDoProfessor/lorem2.txt");
        Writer w = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(w);
        //saida

        String line = br.readLine(); 

        while(line!=null) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
            
        }
        br.close();
        bw.close();
        //algoritimo para escrita na linha e utilizando o metodo `close()` nos dois objetos
        //1a vez que executei: O conteudo do arquivo para leitura foi copiado para o arquivo de escrita (lorem para lorem2), no entando nao houve quebra de linha. Logo, ha a necessidade de implementar um metodo `.newLine()` a cada escrita, no loop while().
        //2a vez que executei: apos a implementacao do metodo acima, houve a copia de um arquivo para o outro totalmente igual

        
    }
}