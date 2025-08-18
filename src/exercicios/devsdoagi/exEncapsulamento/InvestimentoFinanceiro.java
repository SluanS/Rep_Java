package exercicios.devsdoagi.exEncapsulamento;
import java.util.Scanner;
public class InvestimentoFinanceiro {
    private String tipoinvestimento;
    private double valorIncial = 0;
    private double taxaAnual = 0;

    public InvestimentoFinanceiro(String tipoinvestimento, double valorInicial, double taxaAnual) {
        if (valorInicial < 1000) {
            System.out.println("Valor inicial deve ser de no minimo R$1000,00");
        }
        else {
            this.valorIncial = valorIncial;
        }
        if (taxaAnual < 1 || taxaAnual > 20){
            System.out.println("A taxa anual deve estar entre 1% a 20%");
        }
        else{
        this.taxaAnual = taxaAnual;

    }
        this.tipoinvestimento = tipoinvestimento;
    }
    public double calcularValorFuturo(int anos){
        double valor_futuro = valorIncial;
        for (int i = 1; i <= anos; i++){
            double taxaAplicada = valor_futuro * taxaAnual / 100;
            valor_futuro += taxaAplicada;
        }
        return valor_futuro;
    }
    public void exibirResumo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de anos que deseja simular: ");
        int anos = sc.nextInt();
        double valorFinal = calcularValorFuturo(anos);
        System.out.println("Tipo de investimento: "+ this.tipoinvestimento);
        System.out.println("Valor incial: "+this.valorIncial);
        System.out.println("Taxa anual aplicada: "+this.taxaAnual);
        System.out.println("Valor final após "+anos+" Anos: "+valorFinal);
    }
}