public class App {
    public static void main(String[] args){
        Esporte fut = new Esporte(011, "futebol");
        Atleta joao = new Atleta(1, "Joao", 10.75, fut);

        // System.out.println(fut.getIdentificacao() + "\n" + fut.getDescricao());

        System.out.println(joao.getCodigo() + "\n" + joao.getNome() + "\n" + joao.getRecorde() + "\n" + joao.getEsporte().getIdentificacao() + "\n" + joao.getEsporte().getDescricao());
    }
}