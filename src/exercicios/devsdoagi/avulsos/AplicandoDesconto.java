package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
public class AplicandoDesconto {
    public static void main(String[] args){
        float valor_desconto, valor_final, valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor total da compra: ");
        valor = sc.nextFloat();
        if (valor <= 500){
            valor_desconto = valor * 5 / 100;
            valor_final = valor - valor_desconto;
            System.out.println("Parabéns, para compras de até R$500,00 oferecemos 5% de desconto");
            System.out.printf("Na sua compra de R$%.2f você conseguiu um desconto de RS%.2f no valor total\n",
                    valor,valor_desconto);
            System.out.printf("Total a pagar: %.2f",valor_final);
        }
        else if (valor <= 1000){
            valor_desconto = valor * 10 / 100;
            valor_final = valor - valor_desconto;
            System.out.println("Parabéns, para compras de valor entre 500,00 e 1000,00 oferecemos 10% de desconto");
            System.out.printf("Na sua compra de R$%.2f você conseguiu um desconto de RS%.2f no valor total\n",
                    valor,valor_desconto);
            System.out.printf("Total a pagar: %.2f",valor_final);
    }
        else {
            valor_desconto = valor * 12 / 100;
            valor_final = valor - valor_desconto;
            System.out.println("Parabéns, para compras de valor acima de 1000,00 oferecemos 12% de desconto");
            System.out.printf("Na sua compra de R$%.2f você conseguiu um desconto de RS%.2f no valor total\n",
                    valor,valor_desconto);
            System.out.printf("Total a pagar: %.2f",valor_final);
        }

    }
}
