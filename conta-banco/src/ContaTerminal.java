import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
                    
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);
        
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal

        System.out.println ("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt();

        System.out.println ("Por favor, digite o número da Conta!");
        String conta = scanner.next();

        System.out.println ("Por favor, digite o nome do Titular!");
        String nomeCliente = scanner.next();

        System.out.println ("Por favor, digite o valor do saldo!");
        double saldo = scanner.nextDouble();


        //Exibir a mensagem conta criada

        System.out.println ("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                            + agencia + ", conta " + conta + " e seu saldo é de R$ " + saldo);
                            
                        
    }
}
