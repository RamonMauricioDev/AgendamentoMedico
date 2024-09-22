public class Paciente extends Usuario {
    private String serviceSpecialty;    //Especialidade do tratamento
    private long   cardSus;

    public Paciente(String name, long CPF, String serviceSpecialty, long cardSus) {
        super(name, CPF);
        this.serviceSpecialty = serviceSpecialty;
        this.cardSus = cardSus;
    }

    public String getServiceSpecialty() {
        return serviceSpecialty;
    }

    public String toString() {
        return "Nome: " + getName() + " CPF: " + getCPF() +
        " Especialidade do tratamento: " + serviceSpecialty + " Cartão sus: " + cardSus;
    }
}
