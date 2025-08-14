package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class Investimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo atual da conta: ");
        float saldo = sc.nextFloat();

        System.out.println("Escolha seu tipo de investimento:" +
                "\n1 - CBD\n2 - CDI\n3 - Tesouro direto\n4 - FII");
        int escolha = sc.nextInt();

        while (escolha > 4 || escolha < 0){
            System.out.println("Investimento Inválido!");
            System.out.println("Escolha seu tipo de investimento:" +
                    "\n1 - CBD" +
                    "\n2 - CDI" +
                    "\n3 - Tesouro direto" +
                    "\n4 - FII");
            escolha = sc.nextInt();
        }
        switch (escolha){
            case 1:
                System.out.println("Bem-vindo a área de investimento CDB");
                break;
            case 2:
                System.out.println("Bem-vindo a área de investimento CDI");
                break;
            case 3:
                System.out.println("Bem-vindo a área de invesvimento no tesouro diréto");
                break;
            case 4:
                System.out.println("Bem-vindo a área de investimento de FII (fundo de investimento imobiliário)");
                break;

        }
    }
}
