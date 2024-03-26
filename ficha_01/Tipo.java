public class Tipo {
    private String modalidade;
    private int indiceOlimpico;
    private String necessidadeEspecial;

    public Tipo(String modalidade, int indiceOlimpico, String necessidadeEspecial){
        this.modalidade = modalidade;
        this.indiceOlimpico = indiceOlimpico;
        setNecessidadeEspecial(necessidadeEspecial);
    }

    void setModalidade(String modalidade){
        this.modalidade = modalidade; 
    }

    String getModalidade(){
        return modalidade;
    }

    void setIndiceOlimpico(int indiceOlimpico){
        this.indiceOlimpico = indiceOlimpico;
    }

    int getIndiceOlimpico(){
        return indiceOlimpico;
    }

    void setNecessidadeEspecial(String necessidadeEspecial){
        if(this.modalidade == "Olimpico"){
            this.necessidadeEspecial = null;
        } else if (this.modalidade == "Paraolimpico"){
            this.necessidadeEspecial = necessidadeEspecial;
        }
    }
}
