package exercicios.devsdoagi.exvetores;


public class Ex_Vet_08 {
    public static void calcularMediaMovel(float[] precos, int intervalo) {
        int lenght = precos.length;
        float soma = 0;
        for (int i = 0; i < lenght; i++) {
            if (i + intervalo - 1 > lenght-1) {
                break;
            } else {
                soma += precos[i];
                for (int j = 1; j < intervalo; j++) {
                    soma += precos[i + j];
                }
                System.out.println(soma / intervalo);
                soma = 0;
            }
        }
    }
    public static void main (String[] args){
        float[] vet = {100, 102, 101, 103, 105};
        int inter = 2;
        calcularMediaMovel(vet, inter);
    }
}

