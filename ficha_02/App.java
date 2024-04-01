package ficha_02;
import java.util.ArrayList;

public class App {

    public static void main(String[] args){
        Convenio Bradesco = new Convenio(01, "Bradesco");
        Convenio Unimed =  new Convenio(11, "Unimed");
        Paciente joao = new Paciente("Joao", 68, Bradesco);
        Paciente maria = new Paciente("Maria", 69, Unimed);
        Medico davi = new Medico("Davi", 5500);
        davi.adicionarConvenio ("Bradesco");
        davi.adicionarConvenio("Itau");
        // davi.adicionarConvenio("Unimed");
        davi.adicionarConvenio("Servidores");

        Consulta consultaJoao = new Consulta(joao, davi, 8, 20);
        Consulta consultaMaria = new Consulta(maria, davi, 9, 30);
        consultaJoao.marcarConsulta();
        consultaMaria.marcarConsulta();
        
}
}
