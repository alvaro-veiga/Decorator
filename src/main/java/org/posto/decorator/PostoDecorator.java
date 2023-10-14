package main.java.org.posto.decorator;

public abstract class PostoDecorator implements Posto {
    public Posto posto;

    public PostoDecorator(Posto posto) {
        this.posto = posto;
    }

    public Posto getCombustivel() {
        return posto;
    }

    public void setCombustivel(Posto posto) {
        this.posto = posto;
    }

    public abstract float getPreco();

    public float getValorDoServico() {
        return this.posto.getValorDoServico() + this.getPreco();
    }
}