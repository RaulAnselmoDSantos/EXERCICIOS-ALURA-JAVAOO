package bytebank;



public class TestaMetodo {
    public static void main(String[] args) {
        conta contaDoPaulo = new conta(); 
        contaDoPaulo.saldo = 100; 
        contaDoPaulo.deposita(50);

        System.out.println(contaDoPaulo.saldo);
        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        
        conta contaDaMarcela = new conta(); 
        contaDaMarcela.deposita(1000); 

        if(contaDaMarcela.transfere(300, contaDoPaulo)){
            System.out.println("transferencia feita com sucesso");
        } else 
            System.out.println("faltou dinheiro");

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "Paulo Silveira"; 
        System.out.println(contaDoPaulo.titular);
    }
}
 