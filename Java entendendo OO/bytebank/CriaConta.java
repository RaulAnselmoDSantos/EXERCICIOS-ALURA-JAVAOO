package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        conta primeiraconta = new conta(); 
        primeiraconta.saldo = 200; 
        System.out.println(primeiraconta.saldo);

        conta segundaconta = new conta();
        segundaconta.saldo = 50; 
        System.out.println(segundaconta.saldo);
    }
}
