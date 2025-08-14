package exercicios.devsdoagi.avulsos;
import java.util.Scanner;
class AvaliacaoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Agradecemos pela sua preferência :) De 0 a 5 estrela ");
        System.out.println("*****");
        System.out.println("De 0 a 5 estrelas, como você classificaria suas experiência com os nossos serviços? ");
        System.out.println("0 -> Terrivel");
        System.out.println("1 - * -> Péssima");
        System.out.println("2 - ** -> ruim");
        System.out.println("3 - *** -> Regular");
        System.out.println("4 - **** -> Boa");
        System.out.println("5 - ***** -> Excelente");
        int avaliacao = sc.nextInt();
        System.out.print(avaliacao);
        while (avaliacao < 0 || avaliacao > 5){
            System.out.println("Por favor, digite uma avaliacao válida");
            avaliacao = sc.nextInt();
        }
        switch(avaliacao){
            case 0:
                System.out.println("Lamentamos que sua experiência tenha sido negativa :(");
                System.out.println("Ofereça um feedback para que da proxima vez possamos oferecer um melhor atendimento");
                break;
            case 1:
                System.out.println("Lamentamos que sua experiência tenha sido negativa :(");
                System.out.println("Ofereça um feedback para que da proxima vez possamos oferecer um melhor atendimento");
                break;
            case 2:
                System.out.println("Lamentamos que sua experiência tenha sido negativa :(");
                System.out.println("Ofereça um feedback para que da proxima vez possamos oferecer um melhor atendimento");
                break;
            case 3:
                System.out.println("Agradecemos pelo feedback :) Estamos continuamente trabalhando para superar suas expectativas");
                System.out.println("Ofereça um feedback para que da proxima vez possamos oferecer um melhor atendimento");
                break;
            case 4:
                System.out.println("Ficamos felizes pela sua avaliação positiva :)");
                System.out.println("Gostaria de descrever o que mais gostou em nossos serviços? ou até mesmos sugerir possiveis melhorias? ");
                break;
            case 5:
                System.out.println("Agradecemos pela avaliação :) Ficamos felizes pela sua confiança.");
                break;
        }   }
}


