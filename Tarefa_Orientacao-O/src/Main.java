public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Sem histórico criminal", "48.882.542-5", "111.222.333-44", "av teste, rua abrel, n° 123");
        PessoaJuridica pj = new PessoaJuridica( "Sem histórico criminal", "12.345.678/0001-99", "XYZ Comércio Ltda.", "Tesla");

        PessoaFisica pf1 = new PessoaFisica("Rogers Guedes", "Com Histórico crimanal **", "65.885.142.3","582.221.339.52", "av.testandotudo, rua perdidad, n° 576");
        PessoaJuridica pj1 = new PessoaJuridica("Com hitórico criminal", "32.548.689/0020-25","OPS Manutenções", "Ramos Manutenções");

        pf.ExibirInfos();
        pf1.ExibirInfos();
        pj.ExibirInfos();
        pj1.ExibirInfos();
    }
}
