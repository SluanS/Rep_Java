package exercicios.nelioalves._for_while_exercise;
/*
* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
* 1.Álcool
* 2.Gasolina
* 3.Diesel
* 4.Fim
* */
import java.util.Scanner;
public class PostoGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (escolha < 4 || escolha > 4) {
            System.out.println("Digite por qual tipo de abastecimento prefere: ");
            System.out.println("* 1.Álcool\n" +
                    "* 2.Gasolina\n" +
                    "* 3.Diesel\n" +
                    "* 4.Fim");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Obrigado! Sua escolha foi Alcool.");
                    alcool += 1;
                    break;
                case 2:
                    System.out.println("Obrigado! Sua escolha foi gasolina.");
                    gasolina += 1;
                    break;
                case 3:
                    System.out.println("Obrigado! Sua escolha foi Diesel.");
                    diesel += 1;
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        }
        System.out.println("Muito obrigado!\n");
        System.out.printf("Alcool: %d\n",alcool);
        System.out.printf("Gasolina: %d\n",gasolina);
        System.out.printf("Diesel: %d\n",diesel);
    }

}