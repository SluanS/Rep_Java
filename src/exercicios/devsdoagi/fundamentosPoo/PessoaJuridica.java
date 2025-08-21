package exercicios.devsdoagi.fundamentosPoo;

public class PessoaJuridica extends Cliente{
    private String titular;
    private String cnpj;
    private double faturamentoMensal;
    public PessoaJuridica(String titular, String cnpj, double faturamentoMensal){
        this.titular = titular;
        this.cnpj = cnpj;
        this.faturamentoMensal = faturamentoMensal;
    }
    public PessoaJuridica(String nomeTitualar, String cnpj){
        this.titular = nomeTitualar;
        this.cnpj = cnpj;
    }
    public void setTitular(String correctName){
        this.titular = correctName;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setCnpj(String newCnpj){
        this.cnpj = newCnpj;
    }
    public String getCnpj(){
        return  this.cnpj;
    }
    public void setFaturamentoMensal(double novoFaturamente){
        this.faturamentoMensal = novoFaturamente;
    }
    public double getFaturamentoMensal(){
        return this.faturamentoMensal;
    }
    @Override
    public Conta abrirConta(){
        return new Conta(this.titular,this.cnpj);
    }
}
