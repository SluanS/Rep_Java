package exercicios.devsdoagi.exvetores;
import java.util.Scanner;
public class Ex_Vet_09 {

    public static int contarDiasAlta(double[] precos){
        int dias_alta = 0;
        for (int i = 0 ; i <= precos.length -2 ; i++){
            if (precos[i] < precos[i+1]){
                dias_alta += 1;
            }
        }
        return dias_alta;
    }
    public static int contarDiasBaixa(double[] precos){
        int dias_baixa = 0;
        for (int i = 0; i <= precos.length - 2; i++){
            if (precos[i] > precos[i+1]){
                dias_baixa += 1;
            }
        }
        return dias_baixa;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double[] precos_acao = new double[10];
    for (int i = 0; i < 10; i++){
        System.out.printf("Digite o valor do ativo da ação no %dº dia: ",i+1);
        precos_acao[i] = sc.nextDouble();
    }
        System.out.println("Total de dias de baixa: ");
        System.out.println(contarDiasBaixa(precos_acao));
        System.out.println("Total de dias de alta: ");
        System.out.println(contarDiasAlta(precos_acao));
    }
}
