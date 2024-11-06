
package bar;
import java.util.List;

public class Mozo extends Personal {

    public Mozo(String nombre, String apellido, String rol) {
        super(nombre,apellido, rol);
    }

    public void asignarMesa(Mesa mesa, Cliente cliente) {
        cliente.setMesa(mesa);
        mesa.setEstado(true);
    }

  public Pedido tomarPedido(Mesa mesa, List<Producto> productos, int nropedido, float totalapagar) {
    String producto = "nombre del producto"; 
    Pedido pedido = new Pedido(nropedido, producto, totalapagar);
    mesa.agregarPedido(pedido);
    return pedido;
}
}
