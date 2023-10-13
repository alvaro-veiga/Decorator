package main.java.org.posto.decorator;


public class PostoPedido implements Posto {
    public float valorDoCombustivel;

    public PostoPedido() {};

    public PostoPedido(float valorDoCombustivel) {
        this.valorDoCombustivel = valorDoCombustivel;
    }

    public float getValorDoServico() {
        return valorDoCombustivel;
    }
}
