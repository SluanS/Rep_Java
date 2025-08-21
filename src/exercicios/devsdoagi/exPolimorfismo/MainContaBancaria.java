package exercicios.devsdoagi.exPolimorfismo;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Flavia");
        ContaPoupanca contaPoupanca = new ContaPoupanca("Alexsandra");
        ContaCorrente contaCorrente = new ContaCorrente("Luan");
        contaCorrente.gerarRelatorio();
        contaBancaria.gerarRelatorio();
        contaPoupanca.gerarRelatorio();
    }
}
