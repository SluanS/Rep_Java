package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja calcular o fatorial: ");
        int n = sc.nextInt();
        int fatorial = n;
        for (int i = n - 1; i >= 1; i = i - 1){
            fatorial = fatorial * i;
        }
        System.out.printf("%d! = %d",n,fatorial);
    }
}
