package exercicios.devsdoagi.exPolimorfismo;

public class ContaPoupanca extends ContaBancaria{
    //Taxa de rendimento mensal em percentual
    final double taxaRendimento = 0.5;
    public ContaPoupanca(String titular){
        super(titular);
    }
    @Override
    public void gerarRelatorio(){
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Titular: "+getTitular());
        System.out.println("Rendimento mensal: "+taxaRendimento);
    }
}
