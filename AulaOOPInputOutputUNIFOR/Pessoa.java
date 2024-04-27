package AulaOOPInputOutputUNIFOR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf=cpf;
        this.nome=nome;
        this.idade=idade;
    }

    public void setCpf(String cpf) {
        this.cpf=cpf;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setIdade(int idade) {
        this.idade=idade;
    }

    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public void consultarCpf(Pessoa pessoa) throws IOException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu cpf");
        String cpfInseridoConsulta = leitura.nextLine();
        FileInputStream fis = new FileInputStream("/home/raul/Desktop/estudosJava/InputOutput/AulaOOPInputOutputUNIFOR/FichaDeCadastro.txt"); 
        InputStreamReader isr = new InputStreamReader(fis);  
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();  

        while(line!=null) {
            if(line.contains(cpfInseridoConsulta)) {
                System.out.println("Cpf encontrado");
                System.out.println("Cadastro: " + line);
            }else{
                System.out.println("Cpf nao encontrado.");
            }
            line = br.readLine();
            
        }
   

        br.close();
    }


    // public void cadastrar(Pessoa pessoa)throws IOException {
    //     OutputStream fos = new FileOutputStream("/home/raul/Desktop/estudosJava/InputOutput/AulaOOPInputOutputUNIFOR/FichaDeCadastro.txt");
    //     Writer w = new OutputStreamWriter(fos);
    //     BufferedWriter bw = new BufferedWriter(w);
    //     Scanner leitura = new Scanner(System.in);
    //     System.out.println("Digite seu nome");
    //     String nome = leitura.nextLine();
    //     System.out.println("Digite seu cpf:");
    //     String cpf = leitura.nextLine();
    //     bw.write("cpf:"+cpf+", "+"nome:" + nome);
    //     bw.newLine();
    //     bw.close();

    // }    ACIMA: como eu faria o metodo de cadastro


    public boolean cadastrar(Pessoa pessoa) throws IOException {
        FileWriter fileWriter = new FileWriter("/home/raul/Desktop/estudosJava/InputOutput/AulaOOPInputOutputUNIFOR/FichaDeCadastro.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(pessoa.getCpf() + ", "+pessoa.getNome()+", "+pessoa.getIdade());
        bufferedWriter.newLine();
        bufferedWriter.close();
        return true;

    }
}
