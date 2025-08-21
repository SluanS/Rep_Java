package exercicios.devsdoagi.exPolimorfismo;

public class EmprestimoEmpresarial extends Emprestimo{
    final double percentualTaxaMensal = 1;
    public EmprestimoEmpresarial(double valorEmprestimo){
        super(valorEmprestimo);
    }
    @Override
    public double calcularParcela(int meses){
        if (meses <= 0){
            throw new IllegalArgumentException("A quantidade  de meses deve sar maior que zero para o calculo de parcelas");
        }
        else{
            // Calculo do valor de parcela com a aplicação de 1% do valor do empréstimo e uma taxa fixa de R$100,00 mensal
            double valorParcelas = (getValorEmprestimo() / meses) + (getValorEmprestimo() * percentualTaxaMensal / 100) + 100;
            return valorParcelas;
        }
    }
}
