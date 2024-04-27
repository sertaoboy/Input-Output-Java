package Entrada;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main (String [] args) throws IOException {  
        FileInputStream fis = new FileInputStream("/home/raul/Desktop/estudosJava/InputOutput/Entrada/texto.txt"); // objeto referente a classe FileInputStream, que possui o algoritimo de ler arquivos
        InputStreamReader isr = new InputStreamReader(fis);  // InputStreamReader: classe especializada para transformar os bytecodes gerados pela classe FileInputStream em um tipo primitivo: char
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine(); // necessidade de tratar a excecao do IOException; importacao da classe IOException 

        while(line!=null) {
            System.out.println(line);
            line = br.readLine();
            
        }
   

        br.close();
        //1 - cria-se um fluxo concreto porem binario
        //2 - transforma os dados de baixo nivel em caracteres
        //3 - converte os caracteres em arrays para dados legiveis da linha
        
    }
}