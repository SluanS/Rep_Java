package exercicios.nelioalves.while_exercise;
import java.util.Scanner;
public class PlanoCartesianoQuadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cordenada X:");
        int x = sc.nextInt();
        System.out.println("Digite a cordenada Y: ");
        int y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante 2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante 3");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante 4");
            }
            System.out.println("Digite a cordenada X:");
            x = sc.nextInt();
            System.out.println("Digite a cordenada Y:");
            y = sc.nextInt();
        }
        System.out.println("NDA");


    }

}