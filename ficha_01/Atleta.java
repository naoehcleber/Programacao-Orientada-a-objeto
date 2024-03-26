public class Atleta{
    private int codigo;
    private String nome;
    private double recorde;
    private Esporte esporte;
    private Tipo tipo;

    public Atleta(int codigo, String nome, double recorde, Esporte esporte, Tipo tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.recorde = recorde;
        this.esporte = esporte;
        this.tipo = tipo;
        
    }

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

    void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    Tipo geTipo(){
        return tipo;
    }
}