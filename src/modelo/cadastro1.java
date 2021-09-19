package modelo;

public class cadastro1<string> {
    private static String nome;
    private static int cpf;
    private static int nascimento;
    
    public void nomes() {
    }
    public void nomes(int cpf, String nome, int nascimento) {
        cadastro1.nome = nome;
        cadastro1.cpf= cpf;
        cadastro1.nascimento= nascimento;
    }
    public static String getnome(){
        return nome;
    }
    public static void setnome(String nome ){
        cadastro1.nome = nome;
    }
    public static int getcpf() {
        return cpf;
    }
    public static void setcpf(int cpf) {
        cadastro1.cpf= cpf;
    }

    public static int getnascimento() {
        return nascimento;
    }
    public static void setnacimento(int nascimento) {
        cadastro1.nascimento= nascimento;
    }
    
    }
