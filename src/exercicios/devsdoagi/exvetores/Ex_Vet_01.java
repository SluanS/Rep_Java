package exercicios.devsdoagi.exvetores;

import java.util.Scanner;
public class Ex_Vet_01 {
    public static double maiorPreco(double[] precos){
        double maior = precos[0];
        int cumprimento = precos.length;
        for (int i = 0; i < cumprimento; i++){
            if (precos[i] > maior){
                maior = precos[i];
            }
        }
        return maior;
    }
    public static double menorPreco(double[] precos){
        double menor = precos[0];
        int cumprimento = precos.length;
        for (int i = 0; i < cumprimento; i++){
            if (precos[i] < menor){
                menor = precos[i];
            }
        }
        return menor;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];


        for (int c = 0; c < 10; c ++){
            System.out.println("Digite o preço de fechamento da ações no 1º dia: ");
            precos[c] = sc.nextDouble();
        }
        System.out.println("O maior preço é: "+ maiorPreco(precos));
        System.out.println("O menor preço é: "+ menorPreco(precos));
    }
}




