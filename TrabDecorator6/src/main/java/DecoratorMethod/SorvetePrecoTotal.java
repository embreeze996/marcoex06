package DecoratorMethod;


public class SorvetePrecoTotal implements Sorvete {

    public float precoExtra;

    public SorvetePrecoTotal() {
    }

    public SorvetePrecoTotal(float precoExtra) {
        this.precoExtra = precoExtra;
    }

    public float getPrecoExtra() {
        return precoExtra;
    }

    public String getExtras() {
        return "Sorvete básico";
    }

    @Override
    public float getPreco() {
        return 0;
    }

    @Override
    public String getExtra() {
        return null;
    }
}