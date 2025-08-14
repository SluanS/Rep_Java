package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class PotenciacaoManual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Considere a formula: X^Y");
        System.out.print("Digite o valor de x: ");
        float x = sc.nextFloat();
        System.out.print("Agora digite a potenciação. Y = ");
        float y = sc.nextFloat();
        float resultado = x;
        for (int c = 1; c < y; c++ ){
            resultado = resultado * x;
        }
        System.out.printf("%.0f^%.0f = %.0f",x,y,resultado);
    }
}
