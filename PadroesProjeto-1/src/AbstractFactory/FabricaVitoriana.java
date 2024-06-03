package AbstractFactory;

public class FabricaVitoriana extends FabricaDeMoveis{
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVitoriana();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaVitoriana();
    }
}
