package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class FibonacciInversa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor limite para fazermos a sequência de fibonnaci: ");
        int limite = sc.nextInt();
        int sequencia = 1;
        int anterior = 0;
        System.out.println(anterior);
        System.out.println(sequencia);
        while (sequencia <= limite){
            if (sequencia == 1){
                System.out.println(sequencia);
                anterior = sequencia;
                sequencia += 1;
            }
            else{
                System.out.println(sequencia);
                int atual = sequencia + anterior;
                anterior = sequencia;
                sequencia = atual;
            }
        }
            }
    }
