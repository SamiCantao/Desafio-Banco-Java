package Programa;

public class Cliente {

    private static int counter = 1;

    private int numeroCliente;
    private String nome;
    private String cpf;
    private String email;
    private Date accountCreationDate;

    public Cliente() { }

    public Cliente(String nome, String cpf, String email) {
        this.numeroCliente = Cliente.counter;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.accountCreationDate = new Date();
        Pessoa.counter += 1;
    }

    public int getNumeroCliente() {
        return this.numeroCliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    
    }
    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public String toString() {
        return  "\nName: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }


}
