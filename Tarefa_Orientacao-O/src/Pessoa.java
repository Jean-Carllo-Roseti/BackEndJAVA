public abstract class Pessoa {
    public String nome;
    public String fichaLimpa;

    public Pessoa ( String nome, String fichaLimpa) {
        this.nome = nome;
        this.fichaLimpa = fichaLimpa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFichaLimpa() {
        return fichaLimpa;
    }

    public void setFichaLimpa(String fichaLimpa) {
        this.fichaLimpa = fichaLimpa;
    }

    public abstract void ExibirInfos();
}
