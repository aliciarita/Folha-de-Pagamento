package TP1;  //pacote TP1
 
import java.util.ArrayList; 

public class Gerente { //classe Gerente
    //atributos de Gerente
    protected String nome;
    public String CPF;
    protected short idade;
    public String senha;
    
    public ArrayList<Gerente> gerente; //ArrayList para Gerente

    public Gerente(){  //construtor 
        this.gerente = new ArrayList();

    }
    public Gerente(String nome, String CPF, short idade, String senha) { //método construtor para Gerente
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.senha = senha;
        this.gerente = new ArrayList();
    }

    public String getNome() { //método get para nome
        return nome;
    }

    public void setNome(String nome) { //método set para nome
        this.nome = nome;
    }

    public String getCPF() { //método get para CPF
        return CPF;
    }

    public void setCPF(String CPF) { //método set para CPF 
        this.CPF = CPF;
    }

    public short getIdade() { //método get para idade
        return idade;
    }

    public void setIdade(short idade) { //método set para idade
        this.idade = idade;
    }

    public String getSenha() { //método get para senha
        return senha;
    }

    public void setSenha(String senha) { //método set para senha
        this.senha = senha;
    }

    public ArrayList<Gerente> getGerente() { //método get para ArrayList<Gerente>
        return gerente;
    }

    public void setGerente(ArrayList<Gerente> gerente) {  //método set para ArrayList<Gerente>
        this.gerente = gerente;
    }
    
    
}
