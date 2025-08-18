package exercicios.nelioalves._for_while_exercise;
import java.util.Scanner;
public class ExibindoImpares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        System.out.println("Números impares dentro do intervalo de x");
        while (x <= 0 || x >1000){
            System.out.println("Valor fora do range permitido.");
            System.out.println("Digite um número: ");
            x = sc.nextInt();
        }
        for (int i = 0; i < x; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
