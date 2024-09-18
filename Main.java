import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String createPatientName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do paciente: ");
        return scanner.nextLine();
    }

    public static String createPatientCPF(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("CPF do paciente: ");
        return scanner.nextLine();
    }

    public static String createPatientTreatmentSpecialty(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Especialidade do tratamento: ");
        return scanner.nextLine();
    }

    public static String createMedicName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do médico: ");
        return scanner.nextLine();
    }

    public static String createMedicCPF(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("CPF do médico: ");
        return scanner.nextLine();
    }

    public static String createMedicExpertise(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Especialidade: ");
        return scanner.nextLine();
    }

    public static String createMedicCRM(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("CRM: ");
        return scanner.nextLine();
    }

    public static double createMedicSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salário: ");
        return scanner.nextDouble();
    }

    public static void initTerminal(ArrayList<Paciente> pacientList, ArrayList<Medico> medicList) {
        System.out.println("-------Paciente--------");
        System.out.print(pacientList);
        System.out.println("-------Medico--------");
        System.out.print(medicList);
    }

    public static void main(String[] args) {
        ArrayList<Paciente> pacientList = new ArrayList<>();    //Lista de pacientes
        ArrayList<Medico> medicList = new ArrayList<>();        //Lista de médicos
        //Cartões do sus
        CartaoSus PauloCartao = new CartaoSus("Paulo", 2004,
                9, 3, 2011, 11, 9, "M",
                "Maceió", "AL", 89200209123758L);

        //Adicionará um novo paciente pelo terminal
        //pacientList.add(new Paciente(createPatientName(), createPatientCPF(), createPatientTreatmentSpecialty()));

        //Adicionará um novo médico pelo terminal
        medicList.add(new Medico(createMedicName(), createMedicCPF(), createMedicCRM(), createMedicSalary(), createMedicExpertise()));
        //Terminal
        initTerminal(pacientList, medicList);
    }
}
