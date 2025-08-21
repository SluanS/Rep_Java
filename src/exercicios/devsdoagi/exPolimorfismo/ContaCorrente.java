package exercicios.devsdoagi.exPolimorfismo;

public class ContaCorrente extends ContaBancaria{
    /*
    *Valor fixo de 20 reais taxa manutenção
     */
    final double taxaManutencao = 20;
    public ContaCorrente(String titular){
        super(titular);
    }
    @Override
    protected void gerarRelatorio(){
        System.out.println("Titular: "+getTitular());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Taxa de manutenção: "+this.taxaManutencao);
    }
}
