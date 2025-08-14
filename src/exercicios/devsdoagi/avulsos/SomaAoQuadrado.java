package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class SomaAoQuadrado
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja saber o valor ao quadrado: ");
        int valor = sc.nextInt();
        int pow = (int)Math.pow(valor,2);
        int c = 0;
        int i;
        for (i = 0; c != pow; i++){
            if (i % 2 != 0){
                System.out.printf("%d+%d=%d",c,i,c+i);
                System.out.println(" ");
                c = c + i;
            }

        }
        System.out.printf("%d ao quadrado = %d\n",valor,pow);
    }
}

