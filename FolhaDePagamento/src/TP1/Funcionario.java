package TP1;  //pacote TP1

public class Funcionario { //classe com os dados de funcionario
    //Atributos para funcionario
    protected String nome;
    private int CPF;
    protected short idade;
    public int numAvaliacao; // numero de avaliacoes de funcionario
    
    public Funcionario(){ //construtor
    
    }
    public Funcionario(String nome,     //construtor para Funcionario
                          int CPF,
                          short idade,
                          int numAvaliacao){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.numAvaliacao = numAvaliacao;
    }
    //metodos getters e setters para os atributos de Funcionario
    public void setNome(String nome){ //método set para nome
        this.nome = nome;
    }
    public String getNome(){ //método get para nome
        return nome;
    }
    public void setCPF(int CPF){ //método set para CPF
        this.CPF =  CPF;
    }
    public int getCPF(){ //método get para CPF
        return CPF;
    }
    public void setIdade(short idade){ // método set para idade
        this.idade = idade;
    }
    public short getIdade(){ //método get para idade
        return idade;
    }
    public void setNumAvaliacao(int numAvaliacao){ //método set para numAvaliacao
        this.numAvaliacao = numAvaliacao;
    }
    public int getNumAvaliacao(){//método get para numAvaliacao
        return numAvaliacao;
    }

    public int avaliacaoDoCliente(){ //método avaliação do cliente
    // A avaliacao vai de 1 até 5, sendo 1 atendimento pessimo e 5 otimo atendimento
        String atendimento = "";
        switch (numAvaliacao){              //o atendimento é feito de acordo com o numero de avaliacao
            case 1: 
                atendimento = "Pessimo";
            break;
            case 2:
                atendimento = "Ruim";
            break;
            case 3:
                atendimento = "Mediano";
            break;
            case 4:
                atendimento = "Bom";
            break;
            case 5:
                atendimento = "Otimo";
            break;
            default:
                atendimento = "Opcao invalida";
            break;
        }
        return numAvaliacao; //retorna numAvaliacao
    }
}

