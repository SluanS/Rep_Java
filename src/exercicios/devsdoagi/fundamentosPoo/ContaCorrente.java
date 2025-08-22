package exercicios.devsdoagi.fundamentosPoo;

public class ContaCorrente extends Conta{
    public ContaCorrente(String titular, String registro){
        super(titular,registro);
    }
    @Override
    public void aplicarJuros(){
        System.out.println("Nenhum juros aplplicado na conta corrente");
    }
}
