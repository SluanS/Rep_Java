package exercicios.devsdoagi.exvetores;
public class Ex_Vet_03 {
    public static double total_investimento(double[] carteira) {
        double soma = 0;
        for (int i = 0; i <= carteira.length - 1; i++) {
            soma += carteira[i];
        }
        return soma;
    }

    public static double[] percentualPorAcao(double[] carteira) {
        double soma = total_investimento(carteira);
        double[] percentual = new double[carteira.length];
        for (int i = 0; i <= carteira.length - 1; i++) {
            double valor_percentual = (carteira[i]/soma) * 100;
            percentual[i] = valor_percentual;
        }
        return percentual;
    }


    public static void main(String[] args) {
        double[] precos = {100, 150, 100, 120};
        double[] resultado = percentualPorAcao(precos);
        System.out.println("Soma: ");
        System.out.println(total_investimento(precos));
        System.out.println("Vetor: ");
        for (int i = 0; i <= resultado.length - 1; i++) {
            System.out.printf("%.2f\n",resultado[i]);
        }
    }
}


