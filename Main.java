import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    // ANSI escape codes for colors
    public static final String RESET = "\033[0m";  // Reset to default color
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";

    public static Paciente createPatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do paciente: ");
        String name = scanner.nextLine();

        System.out.print("CPF do paciente: ");
        long CPF = scanner.nextLong();
        while (true){
            if(String.valueOf(CPF).length() != 11){
                System.out.println("Algo deu errado, um cpf deve haver 11 digitos, lembre-se de não usar espaço ou , . etc...");
                System.out.print("CPF do paciente: ");
                CPF = scanner.nextLong();
            }else{
                break;
            }
        }

        scanner.nextLine();

        System.out.print("Especialidade do tratamento: ");
        String treatmentEspeciality = scanner.nextLine().trim().toLowerCase(Locale.ROOT);

        System.out.print("Cartão do sus: ");
        long cardSus = scanner.nextLong();
        while (true){
            if(String.valueOf(cardSus).length() != 15){
                System.out.println("Algo deu errado, um cartão sus deve haver 15 digitos, lembre-se de não usar espaço ou , . etc...");
                System.out.print("cartão sus do paciente: ");
                cardSus = scanner.nextLong();
            }else{
                break;
            }
        }

        return new Paciente(name, CPF, treatmentEspeciality, cardSus);
    }

    public static Medico createMedic(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do médico: ");
        String name = scanner.nextLine();

        System.out.print("CPF do médico: ");
        long CPF = scanner.nextLong();

        while (true){
            if(String.valueOf(CPF).length() != 11){
                System.out.println("Algo deu errado, um cpf deve haver 11 digitos, lembre-se de não usar espaço ou , . etc...");
                System.out.print("CPF do médico: ");
                CPF = scanner.nextLong();
            }else{
                break;
            }
        }

        scanner.nextLine();

        System.out.print("Especialidade: ");
        String medicEspeciality = scanner.nextLine().trim().toLowerCase(Locale.ROOT);

        System.out.print("CRM: ");
        String CRM = scanner.nextLine();

        System.out.print("Salário: ");
        double salary = scanner.nextDouble();

        return new Medico(name, CPF, CRM, salary, medicEspeciality);
    }

    public static void makeAppointment(ArrayList<Paciente> pacientList, ArrayList<Medico> medicList, ArrayList<Integer> appointmentList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----Pacientes-----\n");
        for(var i = 0; i < pacientList.size(); i++){
            System.out.println(pacientList.get(i).getName() + " | " + "necessidade especial: " + pacientList.get(i).getServiceSpecialty());
        }
        System.out.println("\n----------------");

        System.out.println("\n-----Medicos-----\n");
        for(var i = 0; i < medicList.size(); i++){
            System.out.println(medicList.get(i).getName() + " | " + "especialidade: " + medicList.get(i).getEspeciality());
        }
        System.out.println("\n----------------\n");

        System.out.print("Qual paciente você deseja marcar uma consulta: ");

        while (true){
            String pacientName = scanner.nextLine();

            Paciente foundPacient = pacientList.stream()
                    .filter(person -> person.getName().equals(pacientName))
                    .findFirst()
                    .orElse(null);

            if(foundPacient != null){
                Medico foundEspecialist = medicList.stream()
                        .filter(person -> person.getEspeciality().equals(foundPacient.getServiceSpecialty()))
                        .findFirst()
                        .orElse(null);

                if (foundEspecialist != null) {
                    System.out.println("Você marcou a consulta do paciente " + foundPacient.getName() +
                            " com o médico " + foundEspecialist.getName() + "\n");

                    initTerminal(pacientList, medicList, appointmentList);
                } else {
                    System.out.println("Um médico especialista não foi encontrado, espere na fila do sus :( \n");
                    initTerminal(pacientList, medicList, appointmentList);
                }
            } else {
                System.out.print("Não há nenhum paciente com este nome, tente novamente: ");
            }
        }
    }

    public static void initTerminal(ArrayList<Paciente> pacientList, ArrayList<Medico> medicList, ArrayList<Integer> appointmentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar um novo paciente no banco de dados: " + RED + "1" + RESET);
        System.out.println("Adicionar um novo médico no banco de dados: " + RED + "2" + RESET);
        System.out.println("Marcar uma consulta: " + RED + "3" + RESET);
        System.out.println("Ver lista de pacientes do banco de dados: " + RED + "8" + RESET);
        System.out.println("Ver lista de médicos do banco de dados: " + RED + "9" + RESET);
        System.out.print("Digite o numero do comando correspondente: ");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                pacientList.add(createPatient());
                System.out.println("\n--------Paciente " + RED + pacientList.getLast().getName() +
                        RESET + " adicionado com " + GREEN + "Sucesso" + RESET + "--------\n");
                break;
            case 2:
                medicList.add(createMedic());
                System.out.println("\n--------Médico " + RED + medicList.getLast().getName() +
                        RESET + " adicionado com " + GREEN + "Sucesso" + RESET + "--------\n");
                break;
            case 3:
                makeAppointment(pacientList, medicList, appointmentList);
                break;
            case 8:
                System.out.println("\n--------Lista de pacientes--------\n");
                System.out.println(pacientList);
                System.out.println("\n--------------------------------\n");
                break;
            case 9:
                System.out.println("\n--------Lista de medicos--------\n");
                System.out.println(medicList);
                System.out.println("\n--------------------------------\n");
                break;
        }

        initTerminal(pacientList, medicList, appointmentList);
    }

    public static void main(String[] args) {
        ArrayList<Paciente> pacientList = new ArrayList<>();    //Lista de pacientes
        ArrayList<Medico> medicList = new ArrayList<>();        //Lista de médicos
        ArrayList<Integer> appointmentList = new ArrayList<>();

        pacientList.add(new Paciente("Ramon", 15515551400L, "Caxumba", 892002066876560L));
        medicList.add(new Medico("Paulo", 15582428300L, "Nada", 24000, "Caxumba"));

        //Terminal
        System.out.println("-----Bem vindo ao terminal de " + BLUE + "Agendamento médico " + YELLOW + "v1.0.0" + RESET + "-----");
        System.out.println("O que deseja fazer ?");
        initTerminal(pacientList, medicList, appointmentList);
    }
}
