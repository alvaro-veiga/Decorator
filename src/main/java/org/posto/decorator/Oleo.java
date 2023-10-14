package main.java.org.posto.decorator;

public class Oleo extends PostoDecorator{
    public Oleo(Posto posto) {
        super(posto);
    }

    public float getPreco() {
        return 2.0f;
    }
}
