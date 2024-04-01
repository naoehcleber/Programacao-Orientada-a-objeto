package ficha_02;

public class Paciente extends Pessoa {
    private int CPF;
    private Convenio convenio;

    public Paciente(String nome, int cpf, Convenio convenio){
        super(nome);
        this.CPF = cpf;
        this.convenio = convenio;
    }

    public void setCPF(int cpf) {
        this.CPF = cpf;
    }
    public int getCPF() {
        return this.CPF;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
    public Convenio getConvenio() {
        return this.convenio;
    }
    public String getConvenioNome(){
        return this.convenio.getNome();
    }
    
}
