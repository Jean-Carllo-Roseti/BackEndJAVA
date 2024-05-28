public class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;
    private String endereco;

    public PessoaFisica(String nome, String fichaLimpa, String rg, String cpf, String endereco) {
        super(nome, fichaLimpa);
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void ExibirInfos() {
        System.out.println("Resultado da pesquisa:");
        System.out.println("Nome da pessoa: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
        System.out.println("Logradouro: " + getEndereco());
        System.out.println("Histórico criminal da pessoa: " + getFichaLimpa());
        System.out.println();
    }
}
