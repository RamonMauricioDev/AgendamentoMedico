public class Medico extends Usuario{
    private String CRM;              //CRM
    private double salary;           //Salário
    private String especiality;      //Especialidade


    public Medico(String name, long CPF, String CRM, double salary, String especiality) {
        super(name, CPF);
        this.CRM = CRM;
        this.salary = salary;
        this.especiality = especiality;
    }

    public String getEspeciality() {
        return especiality;
    }

    public String toString() {
        return "Nome: "+getName() + " CPF: "+getCPF() +" CRM: "+CRM
                +" Salário: "+salary + " Especialidade: "+especiality;
    }
}
