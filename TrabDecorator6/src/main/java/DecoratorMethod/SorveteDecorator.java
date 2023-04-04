package DecoratorMethod;

public abstract class SorveteDecorator implements Sorvete {

    private Sorvete sorvete;
    public String extra;

    public SorveteDecorator(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    public Sorvete getSorvete() {
        return sorvete;
    }

    public void setSorvete(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    public abstract float getPrecoTotal();


    public float getPreco() {
        return this.sorvete.getPreco() * (1 + (this.getPrecoTotal() / 100));
    }

    public abstract String getNomeExtra();

    public String getExtra() {
        return this.sorvete.getExtra() + "/" + this.getNomeExtra();
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
