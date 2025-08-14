package exercicios.nelioalves;
import java.util.Scanner;
import java.util.Locale;

public class CalculosValorPecas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o ID da 1ª peça: ");
        int id = sc.nextInt();
        System.out.printf("Qual o valor unitário da peça (id - %d)",id);
        float valor = sc.nextFloat();
        System.out.println("Escreva a quantidade de itens: ");
        int quantidade = sc.nextInt();

        System.out.println("Escreva o ID da 2ª peça: ");
        int id2 = sc.nextInt();
        System.out.printf("Qual o valor unitário da 2ª peça (id - %d)",id2);
        float valor2 = sc.nextFloat();
        System.out.println("Escreva a quantidade de itens: ");
        int quantidade2 = sc.nextInt();

        System.out.printf("Valor a pagar: %.2f", (valor * quantidade) + (valor2 * quantidade2));
    }
}
