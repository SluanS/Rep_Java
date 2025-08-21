package exercicios.devsdoagi.exHeranca;

public class InvestimentoRendaFixa extends Investimento{
    float taxaAnual;
    byte periodoMeses;
    public InvestimentoRendaFixa(String codigo, double valorInicial, float taxaAnual, byte periodoMeses){
        super(codigo,valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }
    public double calcularValorFinal(){     
        return valorInicial * (1 + taxaAnual * ((double)periodoMeses /12));
    }
}
