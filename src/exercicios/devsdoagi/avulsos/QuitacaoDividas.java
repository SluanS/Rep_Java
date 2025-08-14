package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class QuitacaoDividas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("SIMULADOR DE QUITAÇÃO DE DIVIDA");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Digite o valor da divida: ");
        float saldo_divida = sc.nextFloat();
        int i = 1;
        while (saldo_divida > 0){
            System.out.printf("Valor total da divida: R$%.2f\n", saldo_divida);
            System.out.printf("Digite o valor de pagamento do %dº mês: ",i);
            float pagamento_mes = sc.nextFloat();
            while (pagamento_mes > saldo_divida){
                System.out.println("Você não pode pagar um valor maior do que o saldo atual da dívida!");
                System.out.printf("Digite o valor de pagamento do %dº mês: ",i);
                pagamento_mes = sc.nextFloat();
            }
            saldo_divida -= pagamento_mes;
            i += 1;
        }
        System.out.println("Divida quitada, parabéns!");
    }
}
