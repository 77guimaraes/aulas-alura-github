import java.util.Scanner;

public class desafioBancario {
    public static void main(String[] args) {

        //Inicializa dados do cliente
        String nome = "Bruce";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("*********************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("*********************");

        String menu = """
                \nDigite o numero da opção que deseja:
                
                1 - Consultar Saldo Atual;
                2 - Transferir Valor;
                3 - Receber Valor;
                4 - Sair.""";

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            //Opção 1 - Visualizar Saldo
            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldo);
            }
        }
    }
}