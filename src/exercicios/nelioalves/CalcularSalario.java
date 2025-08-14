package exercicios.nelioalves;
import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID do funcionário: ");
        int id = sc.nextInt();
        System.out.println("Digite as horas trabalhadas do funcionário: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Quanto o funcionário recebe por hora? ");
        float salarioPorHora = sc.nextFloat();
        float totalAReceber = horasTrabalhadas * salarioPorHora;
        System.out.printf("o funcionário de ID %d receberá $%.2f pelas horas trabalhadas",id,totalAReceber);

    }

}
