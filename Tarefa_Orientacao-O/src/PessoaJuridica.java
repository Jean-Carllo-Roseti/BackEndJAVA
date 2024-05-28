public class PessoaJuridica extends Pessoa {
    public String cnpj;
    public String razaoSocial;

    public PessoaJuridica (String fichaLimpa, String nome,String cnpj, String razaoSocial) {
        super(nome, fichaLimpa);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void ExibirInfos() {
        System.out.println("Resultado da pesquisa:");
        System.out.println("Nome: " + getNome());
        System.out.println("Hitórico criminal: " + getFichaLimpa());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Razão social: " + getRazaoSocial());
        System.out.println();
    }
}
