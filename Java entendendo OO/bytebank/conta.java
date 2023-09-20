package bytebank;

public class conta {
    double saldo;
    int agencia; 
    int numero;
    public String titular; 
    String cpf;

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

}
