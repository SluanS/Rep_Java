package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class AlertaGastosMensais {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de gastos mensais :)");
        float valor = 0;
        float total = valor;
        while (valor >= 0){
            System.out.print("Digite um gasto (ou um valor negativo para parar o registro): ");
            valor = sc.nextFloat();
            total += valor;
            System.out.printf("Total mensal = R$%.2f\n",total);
            if (total > 5000){
                System.out.println("Atenção!\nOs gastos mensal ultrapassaram R$5000,00");
            }
        }
        System.out.printf("Total mensal = R$%.2f",total);
    }
}