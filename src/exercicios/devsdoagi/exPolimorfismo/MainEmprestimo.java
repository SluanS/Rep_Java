package exercicios.devsdoagi.exPolimorfismo;

public class MainEmprestimo {
    public static void main(String[] args) {
    EmprestimoEmpresarial emprestimoEmpresarial = new EmprestimoEmpresarial(1000);
    EmprestimoPessoal emprestimoPessoal = new EmprestimoPessoal(1500);
        System.out.println(emprestimoPessoal.calcularParcela(-1));
        System.out.println(emprestimoEmpresarial.calcularParcela(12));
}}
