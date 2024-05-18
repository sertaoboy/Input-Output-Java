import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        //fluxo de entrada com um arquivo.txt
        FileInputStream fis = new FileInputStream("/home/raul/Desktop/Entrada&SaidaAluraOld/java-io/lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        String linhaLida = br.readLine();
        while (linhaLida!=null) {
            System.out.println(linhaLida);
            linhaLida = br.readLine();            
        }
        br.close();
    }
}