package src;

public class testeSacaNegativo {
    public static void main(String[] args) {
        conta conta = new conta(); 
        System.out.println(conta);

        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101); 
        System.out.println(conta.getSaldo());
    }
}
