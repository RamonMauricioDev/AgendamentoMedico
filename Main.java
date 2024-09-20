import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // ANSI escape codes for colors
    public static final String RESET = "\033[0m";  // Reset to default color
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar um novo paciente no banco de dados: " + RED + "1" + RESET);
        System.out.println("Adicionar um novo médico no banco de dados: " + RED + "2" + RESET);
        System.out.println("Ver lista de pacientes do banco de dados: " + RED + "8" + RESET);
        System.out.println("Ver lista de médicos do banco de dados: " + RED + "9" + RESET);
        System.out.print("Digite o numero do comando correspondente: ");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                pacientList.add(new Paciente(createPatientName(), createPatientCPF(), createPatientTreatmentSpecialty()));
                System.out.println("--------Paciente " + RED + pacientList.getLast().getName() +
                        RESET + " adicionado com " + GREEN + "Sucesso" + RESET + "--------");
                break;
            case 2:
                medicList.add(new Medico(createMedicName(), createMedicCPF(), createMedicCRM(), createMedicSalary(), createMedicExpertise()));
                System.out.println("--------Médico " + RED + medicList.getLast().getName() +
                        RESET + " adicionado com " + GREEN + "Sucesso" + RESET + "--------");
                break;
            case 8:
                System.out.println(pacientList);
                break;
            case 9:
                System.out.println(medicList);
                break;
        }

        initTerminal(pacientList, medicList);
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
        //medicList.add(new Medico(createMedicName(), createMedicCPF(), createMedicCRM(), createMedicSalary(), createMedicExpertise()));

        //Terminal
        System.out.println("-----Bem vindo ao terminal de " + BLUE + "Agendamento médico " + YELLOW + "v1.0.0" + RESET + "-----");
        System.out.println("O que deseja fazer ?");
        initTerminal(pacientList, medicList);
    }
}
