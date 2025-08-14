package exercicios.devsdoagi.exvetores;

import java.util.Scanner;
public class Ex_vet_06 {
    public static int[] primeiraTrincaAlta(double[] precos) {
        double atual, proximo;
        int contagem = 0;
        int i = 0;
        int[] trinca_alta = new int[3];
        for (; i < precos.length - 1; i++) {
            atual = precos[i];
            proximo = precos[i + 1];
            if (proximo > atual && contagem < 3) {
                //System.out.printf("Alta de preços no indice %d (%.2f -> %.2f", i + 1, atual, proximo);
                trinca_alta[contagem] = i + 1;
                contagem += 1;
            } else if (contagem != 3) {
                contagem = 0;
            }


        }
        if (contagem == 3) {
            return trinca_alta;
        } else {
            return null;
        }


    }

    public static int[] todasTendenciasAltas(double[] precos) {
        double[] valores = precos;
        int contador = 0;
        for (int i = 0; i < valores.length - 1; i++) {
            if (valores[i] < valores[i + 1]) {
                contador += 1;
            }
        }
        int[] indice_aumento = new int[contador];
        if (contador > 0) {
            int index = 0;
            for (int i = 0; i < valores.length - 1; i++) {
                if (valores[i] < valores[i + 1]) {
                    indice_aumento[index] = i + 1;
                    index += 1;
                }
            }
            return indice_aumento;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor da ação no " + (i + 1) + "º Dia");
            precos[i] = sc.nextDouble();
        }
        int[] resultado = primeiraTrincaAlta(precos);
        if (resultado != null) {
            for (int c = 0; c < resultado.length; c++) {
                System.out.println(resultado[c]);
            }
        }
        resultado = todasTendenciasAltas(precos);
        if (resultado != null) {
            System.out.println("Método 2");
            for (int c = 0; c < resultado.length; c++) {
                System.out.println(resultado[c]);

            }
        }
    }
}
