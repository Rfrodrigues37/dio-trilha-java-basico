import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Insira o limite diario:");
        double limiteDiario = scanner.nextDouble();
        double saldoRestante = limiteDiario;

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
          //  System.out.println("Insira o valor do saque:");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > saldoRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                saldoRestante -= valorSaque;

               System.out.printf("Saque realizado. Limite restante: %.1f%n", saldoRestante);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
