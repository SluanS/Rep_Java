package exercicios.devsdoagi.exvetores;

import java.util.Scanner;


public class Ex_Vet_05 {
    public static double[] calcularJurosCompostos(double valor_inicial, float taxa, int meses) {
        double montante = valor_inicial;
        double[] previsao_valores = new double[meses];
        for (int i = 0; i < meses; i++) {
            double juros_aplicados = montante * taxa / 100;
            montante += juros_aplicados;
            previsao_valores[i] = montante;
            System.out.printf("Após o %d mês tivemos um redimento de %.2f.\n", i + 1, juros_aplicados);
            System.out.printf("Valor do montante atual = %.2f\n", montante);
        }
        return previsao_valores;
    }


    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do aporte inicial");
        double valor_inicial = sc.nextInt();
        System.out.println("Digite a taxa de redimento mensal aplicada sobre o investimento: ");
        float taxa = sc.nextFloat();
        System.out.println("Digite o tempo (em meses) que o dinheiro ficará investido: ");
        int meses = sc.nextInt();
        double[] calculo = calcularJurosCompostos(valor_inicial, taxa, meses);
        for (int i = 0; i < calculo.length; i++) {
            System.out.printf("%dº \n",i+1);
            System.out.printf("%.2f",calculo[i]);
        }
    }
}
