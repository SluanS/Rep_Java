package exercicios.nelioalves;
import java.util.Scanner;

public class CalculoAreaCiruculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        float raio = sc.nextFloat();
        double area = 3.14159 * Math.pow(raio,2);
        System.out.printf("Segue área do ciruculo %.4f",area);

    }
}
