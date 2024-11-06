package bar;


import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private int numero;
    private boolean estado;
    private List<Pedido> pedidos;

    public Mesa(int numero, boolean estado, List<Pedido> pedidos) {
        this.numero = numero;
        this.estado = estado;
        this.pedidos = pedidos;
    }
 public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido); 
        this.estado = true;
    }
 



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    
}


  