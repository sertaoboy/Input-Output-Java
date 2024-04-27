package LendoEEscrevendo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EntradaESaida  {
    public static void main (String[] args) throws IOException{
    FileInputStream fis = new FileInputStream("/home/raul/Desktop/estudosJava/InputOutput/LendoEEscrevendo/Entrada.txt");
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);
    String linha = br.readLine();
    while(linha!=null) {
        System.out.println(linha);
        linha = br.readLine();
    }
    br.close();


    FileOutputStream fos = new FileOutputStream("/home/raul/Desktop/estudosJava/InputOutput/LendoEEscrevendo/Saida.txt");
    OutputStreamWriter osw = new OutputStreamWriter(fos);
    BufferedWriter bw = new BufferedWriter(osw);
    bw.write("ola raul e goku, me chamo java");
    bw.newLine();
    bw.close();




    }
}
