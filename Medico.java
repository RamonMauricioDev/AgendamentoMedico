public class Medico extends Usuario{
    private String CRM;             //CRM
    private float salary;           //Salário
    private String especiality;     //Especialidade


    public Medico(String name, String CPF, String CRM, float salary, String especiality) {
        super(name, CPF);
        this.CRM = CRM;
        this.salary = salary;
        this.especiality = especiality;
    }

    public String toString() {
        return "Nome: "+getName() + "\nCPF: "+getCPF() +"\nCRM: "+CRM
                +"\nSalário: "+salary + "\nEspecialidade: "+especiality;
    }
}
