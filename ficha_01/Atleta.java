public class Atleta{
    private int codigo;
    private String nome;
    private double recorde;
    private Esporte esporte;
  

    // public Atleta(int codigo, String nome, double recorde, Esporte esporte){
    //     this.codigo = codigo;
    //     this.nome = nome;
    //     this.recorde = recorde;
    //     this.esporte = esporte;
        
    // }

    void setCodigo(int codigo){
        this.codigo = codigo;
    }

    int getCodigo(){
        return codigo;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setRecorde(double recorde){
        this.recorde = recorde;
    }

    double getRecorde(){
        return recorde;
    }

    void setEsporte(Esporte esporte){
        this.esporte = esporte;
    }

    Esporte getEsporte(){
        return esporte;
    }

}

