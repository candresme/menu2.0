package co.menu.servicios;

import co.menu.entidades.Producto;
import co.menu.repositorios.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicioImpl implements ProductoServicio{

    @Autowired
    private ProductoRepo productoRepo;

    @Override
    public Producto registrarProducto(Producto producto) {
        Producto p = productoRepo.save(producto);
        return p;
    }

    @Override
    public Producto borrarProducto(Producto producto) throws Exception {
        Optional<Producto> find = Optional.ofNullable(productoRepo.findById(producto.getId()));
        if(!find.isPresent())
            throw new Exception("No existe el producto");

        productoRepo.delete(producto);

        return producto;
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        Producto p = productoRepo.save(producto);
        return p;
    }

    @Override
    public List<Producto> listarProductos() {
        return productoRepo.findAll();
    }
}
