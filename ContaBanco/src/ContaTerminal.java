import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o numero da agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do  cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo");
        double saldo = Double.parseDouble(scanner.nextLine());

        Banco conta = new Banco(numero, agencia, nomeCliente, saldo); 
        
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é "+ agencia+ " ,conta "+ numero + " e seu saldo R$ " + saldo + " já está disponivel para saque.");

    }
}
