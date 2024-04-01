package ficha_02;
import java.util.ArrayList;

public class Medico extends Pessoa {
    private int CRM;
    //arraylist com convenios atendidos
    private ArrayList<String> convenios;

    public Medico(String nome, int crm){
        super(nome);
        this.CRM = crm;
        this.convenios = new ArrayList<>();
    }

    public void setCRM(int crm) {
        this.CRM = crm;
    }
    public int getCRM() {
        return this.CRM;
    }

    public void adicionarConvenio(String convenio){
        this.convenios.add(convenio);
    }
    public void removerConvenio(String convenio){
        this.convenios.remove(convenio);
    }
    public ArrayList<String> getCovenios(){
        return this.convenios;
    }
}
