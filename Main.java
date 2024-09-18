public class Main {
    public static void main(String[] args) {
        //Pacientes
        Paciente Paulo = new Paciente("Paulo", "155.155.514.00", "Joelho");

        //Cartões do sus
        CartaoSus PauloCartao = new CartaoSus("Paulo", 2004,
                9, 3, 2011, 11, 9, "M",
                "Maceió", "AL", 89200209123758L);

        //Medicos
        Medico Carlos = new Medico("Carlos", "092.284.974.00", "HubSpot", 8450.40f, "Joelho");

        //Terminal
        System.out.println("-------Paciente--------");
        System.out.println(Paulo);
        System.out.println("--------Cartão do sus--------");
        System.out.println(PauloCartao);
        System.out.println("--------Médico--------");
        System.out.println(Carlos);
    }
}
