package exercicios.devsdoagi.exConstrutures;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(){
        this("","");
    }
    public ContaBancaria(String nome_titular, String numero_conta){
        this.titular = nome_titular;
        this.numeroConta = numero_conta;
        saldo = 0;
    }
    public ContaBancaria(String nome_titular, String numero_conta, double saldo){
        this.titular = nome_titular;
        this.numeroConta = numero_conta;
        this.saldo = saldo;
    }
}
