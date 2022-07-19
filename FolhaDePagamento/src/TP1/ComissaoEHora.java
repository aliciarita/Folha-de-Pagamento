package TP1;    //pacote TP1

public class ComissaoEHora extends Pagamento{ //subclasse ComissaoEHora herança de Pagamento
    //Atributos de ComissaoEHora
    private double pagamentoComissaoEHora; //pagamento por comissao e hora
    
    porComissao comissao = new porComissao();    //instanciando a subclasse porComissao
    porHora hora = new porHora();                //instanciando a subclass Hora
    
    public ComissaoEHora() { //construtor
    
    }
    public ComissaoEHora(double pagamentoComissaoEHora ){ //método contrutor de comissaEHora
        this.pagamentoComissaoEHora = pagamentoComissaoEHora;
    }
    
    public void setPagamentoComissaoEHora(double pagamentoComissaoEHora) { //método set para pagamentoComissaoEHora
        this.pagamentoComissaoEHora = pagamentoComissaoEHora;
    }
    
    public double getPagamentoComissaoEHora() { //método get para pagamentoComissaoEHora
        return pagamentoComissaoEHora;
    }

    public porComissao getComissao() { //método get para comissao intância da subclasse porComissao
        return comissao;
    }

    public void setComissao(porComissao comissao) { //método set para comissao instância da subclasse porComissao
        this.comissao = comissao;
    }

    public porHora getHora() { //método get para hora instância da subclasse porHora
        return hora;
    }

    public void setHora(porHora hora) { //método set para hora instância da subclasse porHora
        this.hora = hora;
    }

    public void PagamentoComissaoEHora(){  //método PagamentoComissaoEHora para o pagamentoComissaoEHora
        pagamentoComissaoEHora = comissao.pagamentoPorComissao() + hora.PagamentoPorHoras();
    }
    public double valorDoSalario() {  //método abstrato valorDoSalario retorna o valor do salário
        return this.salario = pagamentoComissaoEHora;
    }
   
}
    