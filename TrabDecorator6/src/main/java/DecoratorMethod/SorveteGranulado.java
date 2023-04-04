package DecoratorMethod;

public class SorveteGranulado extends SorveteDecorator {

    public SorveteGranulado(Sorvete sorvete) {
        super(sorvete);
    }


    
    public float getPrecoExtra() {
        return 3.0f;
    }

    public String getNomeExtra() {
        return "Granulados";
    }

    @Override
    public float getPrecoTotal() {
        return 0;
    }
}