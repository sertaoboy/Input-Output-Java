package Saida;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.Writer;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("/home/raul/Desktop/estudosJava/InputOutput/Saida/textoParaEscrita.txt");
        Writer w = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(w);

        bw.write("teste");
        bw.newLine();
        bw.write("escrevendo em outra linha");

        bw.close();
    }
}
