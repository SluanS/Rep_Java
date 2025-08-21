package exercicios.devsdoagi.exHeranca;

public class TransferenciaBancaria extends Transacao{
    String contaOrigem;
    String contaDestino;
    public TransferenciaBancaria(String id, double valor,
                                 String data, String contaOrigem,
                                 String contaDestino){
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;

    }
    public void resumoTransferencia(){
        System.out.printf("Transferência de R$%.2f de %s para %s na data %s",this.valor,this.contaOrigem,this.contaDestino,this.data);
    }
}
