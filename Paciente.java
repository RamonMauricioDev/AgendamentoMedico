public class Paciente extends Usuario {
    private String serviceSpecialty;    //Especialidade do tratamento

    public Paciente(String name, String CPF, String serviceSpecialty) {
        super(name, CPF);
        this.serviceSpecialty = serviceSpecialty;
    }

    public String toString() {
        return "Nome: " + getName() + "\nCPF: " + getCPF() +
        "\nEspecialidade do tratamento: " + serviceSpecialty;
    }
}
