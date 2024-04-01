package ficha_02;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private int hora;
    private int minutos;

    public Consulta(Paciente paciente, Medico medico, int hora, int minutos){
        this.paciente = paciente;
        this.medico = medico;
        this.hora = hora;
        this.minutos = minutos;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getHora() {
        return hora;
    }
    public Medico getMedico() {
        return medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }


    public void marcarConsulta(){
        if(medico.getCovenios().contains(paciente.getConvenioNome())){
            System.out.println("Paciente " + paciente.getNome() + " Sua consulta está marcada às " + hora + ":" + minutos);
        } else {
            System.out.println("O medico nao aceita esse convenio");
        }
    }
}
