package exercicios.devsdoagi.exPolimorfismo;

public class EmprestimoPessoal extends Emprestimo{
    // Taxa de 2% calculo de taxas mensais aplicadas
    final double percentualTaxaMensal = 2;
    public EmprestimoPessoal(double valorEmprestado){
        super(valorEmprestado);
    }
    @Override
    public double calcularParcela(int meses){
        if (meses <= 0 ){
            throw new IllegalArgumentException("Valor deve ser maior que zero!");
            }
        else{
            double parcelaComjuros = (getValorEmprestimo() / meses) + (getValorEmprestimo() * this.percentualTaxaMensal / 100);
            return parcelaComjuros;
        }

    }

}
