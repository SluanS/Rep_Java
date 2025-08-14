package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class ConversaoDolarComLimite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("CONVERSÃO DE BRL 1 = USD 5");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        float valor_total = 0;
        float valor = 0;
        while (valor_total < 1000 && valor >= 0) {
            System.out.println("Digite o valor que deseja converter: ");
            valor = sc.nextFloat();
            while (valor > (1000 - valor_total)){
                System.out.println("Valor inválido!");
                System.out.printf("Limite restante para conversão: R$%.2f\n \n", 1000.00 - valor_total);
                System.out.println("Digite o valor que deseja converter: ");
                valor = sc.nextFloat();
            }
            valor_total = valor_total + valor;
            System.out.println("Conversão feita com sucesso!");
            System.out.printf("BRL R$%.2f = $%.2f USD\n",valor,valor/5);
            System.out.printf("Limite restante para conversão: R$%.2f\n \n", 1000.00 - valor_total);
        }
        if (valor < 0){
            System.out.println("Conversão interrompida devido a valor negativo");
        }
        if (valor_total == 1000) {
            System.out.println("Limite diário de conversão atingido");
        }
    }
}
