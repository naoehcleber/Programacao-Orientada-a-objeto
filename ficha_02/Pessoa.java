package ficha_02;

public class Pessoa {
    private String Nome;
  
    public Pessoa(String nome){
        this.Nome = nome;
        
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }
    public String getNome() {
        return this.Nome;
    }
}
