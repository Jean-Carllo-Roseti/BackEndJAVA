public class Cliente {
    private int horario;
    private int dataEntrega;
    private String quemRecebe;
    private String endereco;
    private int numero;

    public Cliente(int horario, int dataEntrega, String quemRecebe, String endereco, int numero) {
        this.horario = horario;
        this.dataEntrega = dataEntrega;
        this.quemRecebe = quemRecebe;
        this.endereco = endereco;
        this.numero = numero;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(int dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getQuemRecebe() {
        return quemRecebe;
    }

    public void setQuemRecebe(String quemRecebe) {
        this.quemRecebe = quemRecebe;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "horario=" + horario +
                ", dataEntrega=" + dataEntrega +
                ", quemRecebe='" + quemRecebe + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero=" + numero +
                '}';
    }


}
