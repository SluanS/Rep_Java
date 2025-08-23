package exercicios.nelioalves.pensionato;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ReservaService rs = new ReservaService();
        Aluno a1 = new Aluno("Morgan", LocalDate.of(2005,07,29),"Mogan@gmail.com",'f');
        AlunoRepository.alunos.add(a1);
        rs.novoAluno(a1);
        rs.novoQuarto('m');
        rs.novoQuarto('f');
        rs.novoQuarto('m');
        a1.reservarQuarto(QuartoRepository.quartos.get(0));
        a1.reservarQuarto(QuartoRepository.quartos.get(1));
        a1.reservarQuarto(QuartoRepository.quartos.get(2));
        System.out.println(ReservaService.consultarQuartos().get(1).getNomeAluno());
    }
}
