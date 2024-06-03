package AbstractFactory;

public class CadeiraVitoriana implements Cadeira{
    @Override
    public void sentar() {
        System.out.println("Sentado em uma cadeira com detalhes vitorianos.");
    }
}
