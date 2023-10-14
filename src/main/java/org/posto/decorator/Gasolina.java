package main.java.org.posto.decorator;

public class Gasolina extends PostoPedido {

    public Gasolina(Posto posto) {
        super(posto);
    }
    
    public float getPreco() {
        return 3.5f;
    }
    
}
