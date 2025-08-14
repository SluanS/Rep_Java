package exercicios.devsdoagi.exvetores;

public class Ex_Vet_02 {
    public static double[] variacaoDiaria(double[] precos){
        double[] variacoes = new double[precos.length - 1];
        for (int i = 0; i <= precos.length - 2; i++){
            if(precos[i] > precos[i+1]){
                double variacao_diaria = precos[i+1]-precos[i] ;
                variacoes[i] = (variacao_diaria/precos[i]) * 100;
            } else if (precos[i] < precos[i+1]) {
                double variacao_diaria = precos[i] - precos[i+1];
                variacoes[i] = (variacao_diaria/precos[i]) * 100;
            }


        }
        return variacoes;
    }
    public static void main(String[] arg){
        double[] precos = {100,150,100,120};
        double[] resultado = variacaoDiaria(precos);
        for (int i = 0; i <= resultado.length -1; i++){
            System.out.println(resultado[i]);
        }
    }
}

