package TP1;  //pacote TP1

import java.util.ArrayList;

public abstract class Pagamento{ //Superclasse abstrata pagamento 
    //atributos de pagamento
    protected double salario;
    protected int numVendas; //numero de vendas
    protected String funcao;
    protected int qtdAvaliacao; // quantidade de avaliações
    
    //refência aos objetos associados 
    public ArrayList<Funcionario> funcionario; //ArrayList para funcionario
    
    public Pagamento(){//construtor
        this.funcionario = new ArrayList();
    }
    public void Pagamento(double salario,//método construtor para Pagamento
                             int numVendas,
                             String funcao,
                             int qtdAvaliacao){
        this.salario = salario;
        this.numVendas = numVendas;
        this.funcao = funcao;
        this.qtdAvaliacao = qtdAvaliacao;
        this.funcionario = new ArrayList();

    }
    public void addAvaliacaoDoCliente(){ //método addAvaliacaoDoCliente para adicional extra no salário
    //Adicional no salario do funcionario pela avaliacao do cliente  
        Funcionario novo = new Funcionario(); //novo instâcia de Funcionario
        novo.avaliacaoDoCliente();
        qtdAvaliacao = 0; //inicializando quantidade de avaliação
        if(novo.numAvaliacao == 4) // avaliação 4 = Bom
            qtdAvaliacao *= 0.01; //receber um adicional de 0,01 em cada avaliacao
        else if(novo.numAvaliacao == 5) // avaliacao 5 = Ótimo
            qtdAvaliacao *= 0.02; //receber um adicional de 0,02 em cada avaliacao
        
        salario += qtdAvaliacao; //soma a quantidade de avaliações ao salário
    }

    public int getNumVendas() { //método get para numVendas
        return numVendas;
    }

    public void setNumVendas(int numVendas) { //método set para numVendas
        this.numVendas = numVendas;
    }

    public String getFuncao() { //método get para funcao
        return funcao;
    }

    public void setFuncao(String funcao) {//método set para funcao
        this.funcao = funcao;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario(){ //metodo get para o salario
        return salario;
    }

    public int getQtdAvaliacao() {
        return qtdAvaliacao;
    }

    public void setQtdAvaliacao(int qtdAvaliacao) {
        this.qtdAvaliacao = qtdAvaliacao;
    }
  
    // get e set do ArrayList<Funcionario>
    public ArrayList<Funcionario> getFuncionario() { //método get para ArrayList<Funcionario>
        return funcionario;
    }

    public void setFuncionario(ArrayList<Funcionario> funcionario) { //método set para ArrayList<Funcionario>
        this.funcionario = funcionario;
    }
    public abstract double valorDoSalario(); //metodo abstrato valorDoSalario
}
