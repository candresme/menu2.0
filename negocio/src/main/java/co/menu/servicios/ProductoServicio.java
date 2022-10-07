package co.menu.servicios;

import co.menu.entidades.Producto;

import java.util.List;

public interface ProductoServicio {
   Producto registrarProducto(Producto producto);
   Producto borrarProducto(Producto producto) throws Exception;
   Producto actualizarProducto(Producto producto);
   List<Producto> listarProductos();

}
