public class Esporte{
    private int identificacao;
    private String descricao;

    public Esporte(int identificacao, String descricao){
        this.identificacao = identificacao;
        this.descricao = descricao;
    }

    void setIdentificacao(int identificacao){
        this.identificacao = identificacao;
    }

    int getIdentificacao(){
        return identificacao;
    }
    
    void setDescricao(String descricao){
        this.descricao = descricao;
    }

    String getDescricao(){
        return descricao;
    }
}