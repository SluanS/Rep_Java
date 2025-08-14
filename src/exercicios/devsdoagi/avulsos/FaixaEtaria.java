package exercicios.devsdoagi.avulsos;

public class FaixaEtaria{
    public static void main(String[] args){
        int idade = 60;
        if (idade <= 11){
            System.out.println("O usuário é uma criança");
        }
        else if (idade < 18){
            System.out.println("O usuário é um adolescente");
        }
        else if (idade < 50 ){
            System.out.println("Usuário adulto");
        }
        else {
            System.out.println("Usuário idoso");
        }
    }
}