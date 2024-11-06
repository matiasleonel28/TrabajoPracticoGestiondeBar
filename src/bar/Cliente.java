package bar;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private Mesa mesa;
    private List<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

  

    public String getNombre() {
        return nombre;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}