package exercicios.devsdoagi.exPolimorfismo;

public class ContaBancaria {
    //Definindo atributos titular e saldo
    //Atributo "titular" com getter e setter para possiveis alterações futuras tal como saldo
    private String titular;
    private double saldo;
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
    //Definindo getters e setters dos atributos privados
    protected void setTitular(String newName){
        this.titular = newName;
    }
    protected String getTitular(){
        return this.titular;
    }
    protected void setSaldo(double newSaldo){
        this.saldo = newSaldo;
    }
    protected double getSaldo(){
        return this.saldo;
    }
    // metodo genérico de geração de relatório. Será usado nas heranças.
    protected void gerarRelatorio(){
        System.out.println("Relatório genérico");
    }
}
