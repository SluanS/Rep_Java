package exercicios.nelioalves.pensionato;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReservaService {

    public void novoQuarto(char bloco){
        Quarto novoQuarto = new Quarto(bloco);
        QuartoRepository.quartos.add(novoQuarto);
    }
    public void novoAluno(Aluno aluno){
        AlunoRepository.alunos.add(aluno);
    }
    public static ArrayList<Quarto> consultarQuartos(){
        return QuartoRepository.quartos;
    }

}
