package src;

public class conta {

    private double saldo;
    private int agencia; 
    private int numero;
    private Cliente titular;
    private static int total; 

    public conta(int agencia, int numero){
        conta.total++;
        System.out.println("O total de contas é: " + total);
        this.agencia = agencia;
        this.numero = numero; 
        System.out.println("Conta sendo Criada!" + this.numero);
    }

    public void deposita(double valor) {
        saldo = saldo + valor;    
    }

     public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor; 
            return true; 
        } else 
            return false; 
     }

    public boolean transfere(double valor, conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor); 
            return true; 
        } 
            return false;
    }

    public double getSaldo(){
        return this.saldo; 
    }

    public int getNumero() {
        return this.numero; 
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(int numero){
        if(numero <=0){
            System.out.println("Número: Valores menores ou iguais a zero não são validos");
            return;
        }
        this.numero = numero; 
    }


    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Agencia: Valores menores ou iguais a zero não são validos");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return conta.total;  
    }
}
