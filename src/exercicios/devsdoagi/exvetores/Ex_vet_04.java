package exercicios.devsdoagi.exvetores;
import java.util.Scanner;

public class Ex_vet_04 {


    public static double lucroTotal(double[] compra, double[] venda){
        double lucro = 0;
        for (int i = 0; i <= compra.length -1; i++) {
            if (compra[i] > venda[i]) {
                double diferenca = venda[i] - compra[i];
                lucro = lucro + diferenca;


            } else if (compra[i] < venda[i]) {
                double diferenca = venda[i] - compra[i];
                lucro =lucro + diferenca;
            }
        }
        return lucro;
    }

    public static double[] lucroPorAtivo(double[] compra, double[] venda) {
        int n_termos = compra.length;
        double[] retorno_acoes = new double[n_termos];
        for (int i = 0; i <= n_termos-1; i++) {
            if (compra[i] > venda[i]) {
                retorno_acoes[i] = venda[i] - compra[i];
            } else if (compra[i] < venda[i]) {
                retorno_acoes[i] =  venda[i] - compra[i];
            }
        }
        return retorno_acoes;
    }

    public static double calcularImposto(double lucroTotal){
        Scanner sc = new Scanner(System.in);
        if (lucroTotal < 20000){
            return 0.0;
        }
        else {
            System.out.println("Qual será a taxa do imposto aplicado ao lucro total? ");
            double imposto = sc.nextDouble();
            return (lucroTotal * imposto) / 100;
        }
    }


    public static void main(String[] args) {
        double[] compra = {10000, 15000, 10000, 12000};
        double[] venda = {12000, 13000, 11000, 10000};
        double[] resultado = lucroPorAtivo(compra, venda);
        for (int i = 0; i <= resultado.length -1; i++) {
            System.out.printf("%.2f\n", resultado[i]);
        }
        System.out.println("Lucro: ");
        double lucro = lucroTotal(compra,venda);
        System.out.println(lucro);

        System.out.println("Imposto aplicado sobre o valor total: ");
        System.out.println(calcularImposto(lucro));
    }
}

