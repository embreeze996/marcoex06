package DecoratorMethod;

public class SorveteFrutasCrista extends SorveteDecorator {

    public SorveteFrutasCrista(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public float getPrecoTotal() {
        return 0;
    }

    public float getPrecoExtra() {
        return 5.0f;
    }

    public String getNomeExtra() {
        return "Frutas cristalizadas";
    }
}
