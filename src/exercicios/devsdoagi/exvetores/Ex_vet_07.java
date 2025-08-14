package exercicios.devsdoagi.exvetores;
public class Ex_vet_07 {

    public static double calcularCrescimentoAculmulado(double[] precos) {
        double saldo_varivacoes = 0;
        for (int i = 0; i < precos.length - 1; i++) {
            if (precos[i] < precos[i + 1]) {
                saldo_varivacoes = saldo_varivacoes + (precos[i + 1] - precos[i]);
            } else if (precos[i] > precos[i + 1]) {
                saldo_varivacoes = saldo_varivacoes - (precos[i] - precos[i + 1]);
            }
        }
        double percentual_variacao = (saldo_varivacoes / precos[0]) * 100;
        return percentual_variacao;
    }

    public static void main(String[] args) {
        double[] preco = {5, 10, 15, 10, 8};
        System.out.println(calcularCrescimentoAculmulado(preco));
    }

}