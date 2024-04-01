package ficha_02;

public class Convenio  {
    private int Id;
    private String Nome;
    
    public Convenio(int id, String Nome){
        this.Nome = Nome;
        this.Id = id;
    }

    public void setId(int id) {
        this.Id = id;
    }
    public int getId() {
        return Id;
    }
    
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public String getNome() {
        return this.Nome;
    }
}
