package exercicios.nelioalves._for_while_exercise;
import java.util.Scanner;
//Recebe valor N - N determinará a quantidade de valores X a serem lidos
// Após lermos os valores, exibir quantos deles está no intervalo de 10 e 20 quantos não estão.
public class ValoresNoIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores deseja inserir? ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i <= n; i++){
            System.out.printf("Digite o %dº valor: \n",i+1);
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.printf("In: %d\n",in);
        System.out.printf("Out: %d",out);

    }
}
