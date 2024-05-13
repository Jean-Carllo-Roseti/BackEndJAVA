public class Funcionario {
    private String empacotador;
    private String entregador;
    private int horarioSaida;

    public Funcionario (String empacotador, String entregador, int horarioSaida) {
        this.empacotador = empacotador;
        this.entregador = entregador;
        this.horarioSaida = horarioSaida;
    }

    public String getEmpacotador() {
        return empacotador;
    }

    public void setEmpacotador(String empacotador) {
        this.empacotador = empacotador;
    }

    public String getEntregador() {
        return entregador;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;
    }

    public int getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(int horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "empacotador='" + empacotador + '\'' +
                ", entregador='" + entregador + '\'' +
                ", horarioSaida=" + horarioSaida +
                '}';
    }
}
