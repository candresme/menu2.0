package co.menu.servicios;

import co.menu.entidades.Categoria;
import co.menu.entidades.Producto;

import java.util.List;

public interface CategoriaServicio {


    Categoria crearCategoria(Categoria categoria);
    List<Producto> obtenerProductos(Categoria categoria);


}
