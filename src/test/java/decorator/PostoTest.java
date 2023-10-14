package test.java.decorator;

import org.junit.jupiter.api.Test;

import main.java.org.posto.decorator.Gasolina;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class PostoTest {
    @Test
    public void DeveRetornarPedidoVazio() {
        PostoPedido postoPedido = new PostoPedido(0.0f);
        assertEquals(0.0f, postoPedido.getValorDoServico());
    }

    @Test
    public void DeveRetornarPedidoComGasolina() {
        PostoPedido postoPedido = new Gasolina (new PostoPedido(0.0f));
        assertEquals(3.5f, postoPedido.getValorDoServico());
    }

    @Test
    public void DeveRetornarPedidoComDisel() {
        PostoPedido postoPedido = new Disel (new PostoPedido(0.0f));
        assertEquals(2.5f, postoPedido.getValorDoServico());
    }

    @Test
    public void DeveRetornarPedidoComOleo() {
        PostoPedido postoPedido = new Oleo (new PostoPedido(0.0f));
        assertEquals(2.0f, postoPedido.getValorDoServico());
    }


    @Test
    public void DeveRetornarPedidoComGasolinaEDisel() {
        PostoPedido postoPedido = new Gasolina (new Disel (new PostoPedido(0.0f)));
        assertEquals(6.0f, postoPedido.getValorDoServico());
    }

    @Test
    public void DeveRetornarPedidoComGasolinaEOleo() {
        PostoPedido postoPedido = new Gasolina (new Oleo (new PostoPedido(0.0f)));
        assertEquals(5.5f, postoPedido.getValorDoServico());
    }

    @Test
    public void DeveRetornarPedidoComDiselEOleo() {
        PostoPedido postoPedido = new Disel (new Oleo (new PostoPedido(0.0f)));
        assertEquals(4.0f, postoPedido.getValorDoServico());
    }

    @Test
    public void DeveRetornarPedidoComGasolinaEDiselEOleo() {
        PostoPedido postoPedido = new Gasolina (new Disel (new Oleo (new PostoPedido(0.0f))));
        assertEquals(8.0f, postoPedido.getValorDoServico());
    }
    

}
