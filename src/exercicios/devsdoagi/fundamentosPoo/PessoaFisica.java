package exercicios.devsdoagi.fundamentosPoo;
public class PessoaFisica extends Cliente{
    //Dados para abertura da conta indicados como privados para limitar acesso
    private String nomeCliente;
    private String cpfCliente;
    private double rendaMensal;
    //Incializador de objeto, permite a criação de contas com todos os dados necessários
    public PessoaFisica(String nomeCliente, String cpfCliente, double rendaMensal) {
        if (rendaMensal < 0 || !cpfCliente.matches("^\\d{11}$")) {
            throw new IllegalArgumentException("Argumento inváido, CPF deve ter até 11 carcteres");
        } else {
            this.nomeCliente = nomeCliente;
            this.cpfCliente = cpfCliente;
            this.rendaMensal = rendaMensal;
        }
    }
    //Segundo construtor que permite a criação da conta sem a inclusão da renda mensal do cliente
    public PessoaFisica(String nomeCliente, String cpfCliente){
        if (!cpfCliente.matches("^\\d{11}$")) {
            throw new IllegalArgumentException("Argumento inváido, CPF deve ter até 11 carcteres");
        }
        else {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }
     }
    //Getters e Setters para obter informações mais delicadas
    public void setNomeCliente(String newName){
        this.nomeCliente = newName;
    }
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setCpfCliente(String correctCpf){
        this.cpfCliente = correctCpf;
    }
    public String getCpfCliente(){
        return cpfCliente;
    }
    public void setRendaMensal(double rendaAtualizada){
        this.rendaMensal = rendaAtualizada;
    }
    public double getRendaMensal(){
        return this.rendaMensal;
    }
    // Metodo que retorna um objeto da classe conta com os atributos adquieridos na classe cliente
    public ContaCorrente abrirContaCorrente(){
        return new ContaCorrente(this.nomeCliente,this.cpfCliente);
    }
    @Override
    public ContaPoupanca abrirPoupanca(){
        return new ContaPoupanca(this.nomeCliente, this.cpfCliente);
    }
}
