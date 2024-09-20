public abstract class Usuario {
    private String name;    //Nome do usuário
    private long   CPF;       //CPF

    public Usuario(String name, long CPF){
        this.name = name;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public long getCPF() {
        return CPF;
    }
}