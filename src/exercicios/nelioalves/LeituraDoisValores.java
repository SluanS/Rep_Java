package exercicios.nelioalves;
import java.util.Scanner;

public class LeituraDoisValores {
    public static void main(String[] args){
        int valor1, valor2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();
        System.out.printf("%d + %d = %d",valor1,valor2,valor1+valor2);

    }
}
