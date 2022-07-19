package TP1; //pacote TP1

public class porHora extends Pagamento{ //Subclasse porhora herança de Pagamento
    private double valorPorHoras = 15; //valor por horas trabalhadas
    private int numDeHoras; //número de horas trabalhadas
    private double horasExtras; //hora extra
    private double pagamentoHoras; //pagamento por horas
    public porHora(){//construtor
        
    }
    public porHora(double valorPorHoras, //método construtor para porHora
                   int numDeHoras,
                   double horasExtras,
                   double pagamentoHoras){
        this.valorPorHoras = valorPorHoras;
        this.numDeHoras = numDeHoras;
        this.horasExtras = horasExtras;
        this.pagamentoHoras = pagamentoHoras;
    }

    public double getValorPorHoras() { //método get para valorPorHoras
        return valorPorHoras;
    }

    public void setValorPorHoras(double valorPorHoras) {//método set para valorPorHoras
        this.valorPorHoras = valorPorHoras;
    }

    public int getNumDeHoras() {//método get para numDeHoras
        return numDeHoras;
    }

    public void setNumDeHoras(int numDeHoras) {//método set para numDeHoras
        this.numDeHoras = numDeHoras;
    }

    public double getHorasExtras() {//método get para horasExtras
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {//método set para horasExtras
        this.horasExtras = horasExtras;
    }

    public double getPagamentoHoras() { //método get para pagamentoHoras
        return pagamentoHoras;
    }

    public void setPagamentoHoras(double pagamentoHoras) {//método set para pagamentohoras
        this.pagamentoHoras = pagamentoHoras;
    }
    
    public double valorHoraExtra(){ //método valorHoraExtra verifica se possui horas extras
        if(horasExtras > 0){ //se possuir horas extras
            //se o funcionario trabalhar horas extras ele terá o valorporHoras e mais metade desse valor
            horasExtras = valorPorHoras + (valorPorHoras / 2); //adiciona ao valorPorHoras metade do valorHoraExtra
        }
        else 
            horasExtras = 0; //caso nao tenha horas extras
        
        return horasExtras; //retorna horas extras
    }
    public double PagamentoPorHoras() {//método PagamentoPorHoras 
       pagamentoHoras =  (numDeHoras * valorPorHoras) + horasExtras; //calculo do pagamento por horas
       return pagamentoHoras;
    }
    public double valorDoSalario() {//método abstrato valorDoSalario retorna o valor do salário
        return this.salario = pagamentoHoras; 
    }
    
}
