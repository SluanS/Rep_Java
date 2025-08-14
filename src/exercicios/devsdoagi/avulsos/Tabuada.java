package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deseja saber a tabuada de qual número? ");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}
