package AbstractFactory;

public class FabricaModerna  extends  FabricaDeMoveis{
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }
}
