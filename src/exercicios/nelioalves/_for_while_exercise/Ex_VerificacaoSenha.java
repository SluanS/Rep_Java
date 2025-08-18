package exercicios.nelioalves._for_while_exercise;
import java.util.Scanner;
public class Ex_VerificacaoSenha {
    public static void main(String[] args){
        //Senha pré definida
        String senha = "2002";
        Scanner sc = new Scanner(System.in);
        //Verificação de senha
        System.out.println("Digite a senha: ");
        String tentativa = sc.nextLine();
        //comparação entre tentativa e senha verdadeira
        //Metodo '.equals' utilizado para comparação entre objetos de string
        while (!(tentativa.equals(senha))){
            System.out.println("Senha inválida!");
            System.out.println("Digite a senha: ");
            tentativa = sc.nextLine();
        }
        System.out.println("Acesso autorizado!");


}
}
