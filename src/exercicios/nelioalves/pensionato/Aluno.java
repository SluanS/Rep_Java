package exercicios.nelioalves.pensionato;
import java.time.LocalDate;
public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private char genero;

    public Aluno(String nome, LocalDate dataNascimento, String email, char genero){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.genero = genero;
    }
    public Aluno(String nome, LocalDate dataNascimento, char genero){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    public Aluno(String nome, LocalDate dataNascimento){
        this.nome = nome;
    }
    public void reservarQuarto(Quarto quarto){
        if (quarto.getBloco() != this.genero){
            System.out.println("O aluno só pode reservar quartos no bloco " +((this.genero == 'm')? "Masculino":"Feminino"));
        }
        else{
        quarto.alugarQuarto(this.nome);
    }
    }

    //Getters e Setters
    public void setNome(String correctName){
        this.nome = correctName;
    }
    public String getNome(){
        return this.nome;
    }
    public LocalDate getDataNascimento(){return dataNascimento;}
}
