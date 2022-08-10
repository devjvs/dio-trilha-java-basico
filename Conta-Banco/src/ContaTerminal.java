import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int numeroConta = 1021;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = sc.nextLine();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
