package exercicios.devsdoagi.fundamentosPoo;

public class MainSistemaBancario {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Pamela Beasley","32165478998");
        PessoaFisica pf1 = new PessoaFisica("Jim Helpert","15412265487",6000.00);
        PessoaJuridica pj = new PessoaJuridica("DunderMiflin","2222222222",01000.00);
        PessoaJuridica pj2 = new PessoaJuridica("Michel Scott paper company","25654-61");
        Conta[] contas = {pf.abrirContaCorrente(),pf1.abrirPoupanca(),pf.abrirPoupanca(),pf1.abrirContaCorrente()};
        System.out.println(contas[0].getTitular());
        System.out.println("Saldo atual: "+contas[1].getSaldo());
        contas[0].depositar(1000);
        System.out.println("Saldo atual: "+contas[0].getSaldo());
        contas[2].depositar(150);
        contas[2].sacar(100);
        contas[2].aplicarJuros();
        System.out.println(contas[2].getSaldo());
        System.out.println("Jim Helpert cont: "+contas[1].getNumeroConta());

    }
}
