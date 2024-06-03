package AbstractFactory;

public class Cliente {
    private Cadeira cadeira;
    private Mesa mesa;

    public Cliente (FabricaDeMoveis fabrica) {
        cadeira = fabrica.criarCadeira();
        mesa = fabrica.criarMesa();
    }

    public void usarMoveis() {
        cadeira.sentar();
        mesa.usar();
    }

    public  static void main(String args[]){
        FabricaDeMoveis fabricaModerna = new FabricaModerna();
        Cliente cliente1 = new Cliente(fabricaModerna);
        cliente1.usarMoveis();

        FabricaDeMoveis fabricaVitoriana = new FabricaVitoriana();
        Cliente cliente2 = new Cliente(fabricaVitoriana);
        cliente2.usarMoveis();
    }

}

