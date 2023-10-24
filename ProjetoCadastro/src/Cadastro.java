public class Cadastro {

    private String nomeUsuario;

    private String email;

    private String password;


    public Cadastro(){

    }
    public Cadastro(String nomeUsuario, String email, String password) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.password = password;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
