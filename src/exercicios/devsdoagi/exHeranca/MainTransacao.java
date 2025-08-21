package exercicios.devsdoagi.exHeranca;

public class MainTransacao {
    public static void main(String[] args) {
        TransferenciaBancaria tb = new TransferenciaBancaria("23",100000,"29/07/2026","Agibank","Luan dos Santos Silva");
        tb.resumoTransferencia();
    }
}
