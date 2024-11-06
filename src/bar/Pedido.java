package bar;

import java.util.List;

public class Pedido {

    private List<Producto> productos;
    private int nropedido;
    private String producto;
    private float totalapagar;

    public Pedido(int nropedido, String producto, float totalapagar) {
            this.nropedido = nropedido;
            this.producto = producto;
            this.totalapagar = totalapagar;
        }
    
    public float calcular_total() {
        float total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio(); 
        }
        return total;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getNropedido() {
        return nropedido;
    }

    public void setNropedido(int nropedido) {
        this.nropedido = nropedido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(float totalapagar) {
        this.totalapagar = totalapagar;
    }
 
    }


    

   
