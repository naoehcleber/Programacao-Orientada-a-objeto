public class App {
    public static void main(String[] args){
        Esporte fut = new Esporte(011, "futebol");
        //Atleta joao = new Atleta(1, "Joao", 10.75, fut);
        Paraolimpico davi = new Paraolimpico();
        Olimpico joao = new Olimpico();
        joao.setCodigo(1);
        joao.setNome("Joao");
        joao.setRecorde(10.75);
        joao.setEsporte(fut);
        joao.setIndiceOlimpico(10);

        davi.setCodigo(2);
        davi.setNome("Davi");
        davi.setRecorde(15.75);
        davi.setEsporte(fut);
        davi.setIndiceOlimpico(12);
        davi.setNecessidadeEspecial("A");



        // System.out.println(fut.getIdentificacao() + "\n" + fut.getDescricao());

        System.out.println(joao.getCodigo() + "\n" + joao.getNome() + "\n" + joao.getRecorde() + "\n" + joao.getEsporte().getIdentificacao() + "\n" + joao.getEsporte().getDescricao() + "\n" + joao.getIndiceOlimpico());
        System.out.println(davi.getCodigo() + "\n" + davi.getNome() + "\n" + davi.getRecorde() + "\n" + davi.getEsporte().getIdentificacao() + "\n" + davi.getEsporte().getDescricao() + "\n" + davi.getIndiceOlimpico());

    }
}