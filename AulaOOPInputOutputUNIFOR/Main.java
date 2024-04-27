package AulaOOPInputOutputUNIFOR;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pessoa p1 = new Pessoa("0001", "carlos", 28);
        Pessoa p2 = new Pessoa("1111", "lais", 19);
        p1.cadastrar(p1);
        p2.cadastrar(p2);
       // p1.consultarCpf(p1);
    }
}
