package exercicios.devsdoagi.exEncapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria("Luan","552915082120");
        ContaBancaria cb3 =new ContaBancaria();
        cb.setTitular("Andrea");
        cb.setNumeroConta("55555555");
        cb2.setNumeroConta("7539512468");
        cb.deposito(600);
        cb2.saque(200);
        cb.saque(150);
        cb.exibirExtrato();
        cb2.exibirExtrato();
        cb3.exibirExtrato();

        //Teste investimento financeiro
        InvestimentoFinanceiro iv = new InvestimentoFinanceiro("CDB",1000,10);
        System.out.println(iv.calcularValorFuturo(3));
        iv.exibirResumo();

    }
}
