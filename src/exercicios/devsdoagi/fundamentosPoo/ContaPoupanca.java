package exercicios.devsdoagi.fundamentosPoo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, String registro){
        super(titular,registro);
    }
    @Override
    public void aplicarJuros(){
        setSaldo(getSaldo() * 1.01);
    }
}
