package exercicios.devsdoagi.exvetores;

import java.util.Scanner;

public class Ex_Vet_10 {
    public static double maiorDrawDown(double[] precos) {
        double maximaHistorica = 0;
        double segundaMaxima = 0;
        for (int i = 0; i < precos.length - 1; i++) {
            if (precos[i] >= maximaHistorica) {
                maximaHistorica = precos[i];
                System.out.println("Maxima: ");
                System.out.println(maximaHistorica);
            }
        }
        for (int i = 0; i < precos.length - 1; i++) {
            if (precos[i] >= segundaMaxima && precos[i] != maximaHistorica) {
                System.out.println("Executado");
                segundaMaxima = precos[i];
                System.out.println(segundaMaxima);
            }
        }
        return ((maximaHistorica - segundaMaxima) / maximaHistorica) * 100;
    }

            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                double[] precos_acao = new double[10];
                for (int i = 0; i < 10; i++) {
                    System.out.printf("Digite o valor do ativo da ação no %dº dia: ", i + 1);
                    precos_acao[i] = sc.nextDouble();
                }
                System.out.println("O melhor DrawnDown foi: "+maiorDrawDown(precos_acao));
            }
        }