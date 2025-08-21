package exercicios.devsdoagi.fundamentosPoo;

import java.util.Random;

public class Conta implements OperacoesBancarias{
    private String titular;
    private String registro;
    private String numeroConta;
    private double saldo;

    public Conta(String titular, String registro){
        Random random = new Random();
        this.titular = titular;
        this.registro = registro;
        this.numeroConta = Integer.toString(random.nextInt(9999999));
        this.saldo = 0;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titularAtualizado){
        this.titular = titularAtualizado;
    }
    public String getRegistro(){
        return this.registro;
    }
    public void setRegistro(String correctRegister){
        this.registro = correctRegister;
    }
    public double getSaldo(){
        return this.saldo;
    }
    @Override
    public void sacar(double valor){
        if (valor > this.saldo || valor < 0){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        else {
            this.saldo = this.saldo - valor;
            System.out.printf("Saque de R$%.2f autorizado pela intituição financeira",valor);
        }
    }
    @Override
    public void depositar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor inválido para deposito");
        }
        else {
            this.saldo += valor;
            System.out.printf("Deposíto de R$%.2f efetuado com sucesso");
        }
    }
}
