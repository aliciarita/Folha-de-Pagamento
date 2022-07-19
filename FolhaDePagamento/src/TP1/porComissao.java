package TP1; //pacote TP1

public class porComissao extends Pagamento{ //Subclasse porComissao herança de Pagamento
    private int qtdVendas; //quantidade de vendas
    private double valorVendas = 50; //valor por venda
    private double porcentagemComissao = 0.05;
    private double vendas; 
    private double pagamentoPorComissao; //pagamento por comissao
    public porComissao(){  //construtor
        
    }
    
    public porComissao(int qtdVendas,  //método construtor para porComissao
                       double valorVendas,
                       double porcentagemComissao,
                       double pagamentoPorComissao,
                       double vendas){
        this.qtdVendas = qtdVendas;
        this.valorVendas = valorVendas;
        this.porcentagemComissao = porcentagemComissao;
        this.pagamentoPorComissao = pagamentoPorComissao;
        this.vendas = vendas;
    }

    public int getQtdVendas() { //método get para qtdVendas
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {//método set para qtdVendas
        this.qtdVendas = qtdVendas;
    }

    public double getValorVendas() { //método get para valorVendas
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {//método set para valorVendas
        this.valorVendas = valorVendas;
    }

    public double getPagamentoPorComissao() { //método get para pagamentoPorComissao
        return pagamentoPorComissao;
    }

    public void setPagamentoPorComissao(double pagamentoPorComissao) {//método set para pagamentoPorComissao
        this.pagamentoPorComissao = pagamentoPorComissao;
    }

    public double getVendas() { //método get para vendas
        return vendas;
    }

    public void setVendas(double vendas) { //método set para vendas
        this.vendas = vendas;
    }
    
    public void vendas(){ //método vendas que calcula as vendas
        vendas = qtdVendas * valorVendas;
    }
    public double pagamentoPorComissao(){ //método pagamentoPorComissao retorna o valaor pagamentoPorComissao
        pagamentoPorComissao = porcentagemComissao * vendas;
        return pagamentoPorComissao;
    }
    public double valorDoSalario(){ //método abstrato valorDoSalario retorna o valor do salário
        return this.salario = pagamentoPorComissao;
    }
   
}
