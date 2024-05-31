import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor de saque: ");
        double saque = scanner.nextDouble();
        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;
        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {

            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transação realizada com sucesso.");
        } else { 
               double saldoTotal = saldo + limiteChequeEspecial; 
               if (saldoTotal - saque > 0) {
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
                 System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
           
            }else {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido."); 
                // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."

            }
        }
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}