package main.java.org.posto.decorator;


public class Disel extends PostoDecorator {
    public Disel(Posto posto) {
        super(posto);
    }

    public float getPreco() {
        return 2.5f;
    }
}
