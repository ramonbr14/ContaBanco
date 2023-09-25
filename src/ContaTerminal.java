import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;       


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agencia(com digito e traço)!");
        agencia = scanner.next();
        //o Scanner não aceita nome com espaco no .next e o netline está pulando uma linha,
        // por isso ele foi dividido entre nome e  sobre nome.
        System.out.println("Por favor, digite seu primeiro nome\n");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite seu sobrenome!\n");
        nomeCliente = nomeCliente + " " + scanner.next();
        
        System.out.println("Por favor, digite seu saldo inicial!");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+ numero +" e seu saldo de R$ "+saldo+" já está disponível para saque");
    }
}