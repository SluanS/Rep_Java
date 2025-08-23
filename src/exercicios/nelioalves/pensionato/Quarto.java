package exercicios.nelioalves.pensionato;

public class Quarto {

    //bloco feminino ou masculino
    private char bloco;
    private final int NUMERO_QUARTO;
    private boolean ocupado;
    private String nomeAluno;

        public Quarto(char bloco) {
            this.bloco = bloco;
            this.ocupado = false;

            if (this.bloco != 'm' && this.bloco != 'f') {
                throw new IllegalArgumentException("Bloco invállido! Opções disponiveis: 'm' OU 'f'");
            }

        if (!QuartoRepository.quartos.isEmpty()) {
            this.NUMERO_QUARTO = QuartoRepository.quartos.getLast().NUMERO_QUARTO + 1;
        } else {
            this.NUMERO_QUARTO = 1;
        }

    }

    // Usado na classse aluno
    public void alugarQuarto(String nome){
        if (this.ocupado){
            System.out.println("Quarto ja está em uso pelo Aluno: "+this.nomeAluno);
            System.out.println("Para atualizar o check-in, desocupe o quarto primeiro!");
        }
        else {
            this.nomeAluno = nome;
            this.ocupado = true;
    }

    }
    public void desocuparQuarto(){
        this.nomeAluno = null;
        this.ocupado = false;
    }

    //Criação de getters e setters
    public boolean getAlugado(){ return this.ocupado; }

    public void setBloco(char correctBloc){
        this.bloco = correctBloc;
    }

    public char getBloco(){ return this.bloco; }

    public int getNUMERO_QUARTO(){ return NUMERO_QUARTO; }

    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    public String getNomeAluno(){return this.nomeAluno;}
}
