package src;

public class TestaGeteSet {
    public static void main(String[] args) {
        conta conta = new conta(1337, 24226); 
        
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());
    }
}
