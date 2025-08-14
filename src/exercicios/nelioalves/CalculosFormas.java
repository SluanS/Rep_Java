package exercicios.nelioalves;
import java.util.Scanner;
import java.util.Locale;

public class CalculosFormas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A, B e C respectivamente: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        System.out.printf("A área do tringulo de base %.2f e %.2f por altura: %.2f\n",a,c, (a*c)/2);
        System.out.printf("A area do ciruclo de raio %.2f: %.3f\n",c,3.14159 * Math.pow(c,2));
        System.out.printf("A area do trapézio com base de %.2f e %.2f e %.2f de altura: %.3f\n",a,b,c,(a+b)*c/2);
        System.out.printf("A area do quadrado de lado %.2f é: %.3f \n",b,Math.pow(b,2));
        System.out.printf("A area do Retangulo de lado %.2f e %.2f é: %.3f",a,b,a*b);
    }
}
