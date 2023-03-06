public class Gafanhoto extends Pessoa {

    private String login;
    private int totalAsssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAsssistido = 0;
    }

    public void viuMaisUm(){
        setTotalAsssistido(getTotalAsssistido() + 1);
        ganharExp();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAsssistido() {
        return totalAsssistido;
    }

    public void setTotalAsssistido(int totalAsssistido) {
        this.totalAsssistido = totalAsssistido;
    }

    @Override
    public String toString() {
        return "gafanhoto [" + super.toString() + "\n login=" + login + ", totalAsssistido=" + totalAsssistido + "]";
    }
}
