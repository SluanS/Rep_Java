package exercicios.devsdoagi.exPolimorfismo;

public class Emprestimo {
    private double valorEmprestimo;
    public Emprestimo(double valorEmprestimo){
        this.valorEmprestimo = valorEmprestimo;
    }
    public double calcularParcela(int meses) {
        if (meses <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0!");
        } else {
            return valorEmprestimo / meses;
        }
    }
    protected double getValorEmprestimo(){
        return valorEmprestimo;
    }
}
