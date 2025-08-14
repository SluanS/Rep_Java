package exercicios.nelioalves;
import java.util.Scanner;

public class ResultadoDeProduto {
    public static void main(String[] args) {
        float a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto A: ");
        a = sc.nextFloat();
        System.out.print("Digite o valor do produto B: ");
        b = sc.nextFloat();
        System.out.print("Digite o valor do produto C: ");
        c = sc.nextFloat();
        System.out.print("Digite o valor do produto D: ");
        d = sc.nextFloat();
        float produto = (a * b - c * d);
        System.out.printf("(%.1f + %.1f) - (%.1f + %.1f) = %.2f",a,b,c,d,produto);
    }
}
