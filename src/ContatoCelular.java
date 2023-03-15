public class ContatoCelular {
    private String nome;
    private String telefone;
    private String email;
    private String dataNascimento;
    private String celular;

    public ContatoCelular(String nome, String telefone, String email, String dataNascimento, String celular) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void getCelular(String celular) {
        this.celular = celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nEmail: " + this.email + "\nData de Nascimento: " + this.dataNascimento + "\nCelular: " + this.celular;
    }
}
