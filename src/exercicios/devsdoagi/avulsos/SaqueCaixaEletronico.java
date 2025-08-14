package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class SaqueCaixaEletronico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o saldo atual da conta: ");
        float saldo = sc.nextFloat();
        while (saldo > 0){

            System.out.println("Digite o valor que deseja sacar: ");
            float saque = sc.nextFloat();

            while (saque > saldo){
                System.out.println("Saldo insuficiente: ");
                saque = sc.nextFloat();
            }

            saldo = saldo - saque;
            System.out.println("Saque autorizado pela intituição financeira");
            System.out.println("Saldo atual: " + saldo);

        }
    }
}
