package exercicios.devsdoagi.fundamentosPoo;

public abstract class Cliente {
    //metodo abstrato que será usado para abertura de contas dos objetos das classes decendentes
    protected abstract ContaCorrente abrirContaCorrente();
    protected abstract ContaPoupanca abrirPoupanca();
}
