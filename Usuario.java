public abstract class Usuario {
    private String name;    //Nome do usuário
    private String CPF;     //CPF

    public Usuario(String name, String CPF){
        this.name = name;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }
}