package exercicios.devsdoagi.exEncapsulamento;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    public ContaBancaria(){
        titular = "Nenhum titular definido";
        numeroConta = "Não definido";
        saldo = 0;
    }
    public ContaBancaria(String titular,String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        saldo = 0;
    }
    public void setTitular(String novoTitular){
        this.titular = novoTitular;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setNumeroConta(String novoNumeroConta){
        numeroConta = novoNumeroConta;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public void deposito(double novoDeposito){
        if (novoDeposito <= 0){
            System.out.println("Valor inválido");
        }
        else {
            saldo += novoDeposito;
        }
    }
    public void saque(double novo_saque){
        if (novo_saque > this.saldo){
            System.out.println("Valor inválido para saque");
        }
        else {
            System.out.println("Saque autorizado pela insituição financeira");
            saldo -= novo_saque;
        }
    }
    public void exibirExtrato(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo: "+this.saldo);
    }
}
