package co.menu.servicios;

import co.menu.entidades.Categoria;
import co.menu.entidades.Producto;
import co.menu.repositorios.CategoriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicioImpl implements CategoriaServicio{
    @Autowired
    private CategoriaRepo categoriaRepo;

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepo.save(categoria);
    }

    @Override
    public List<Producto> obtenerProductos(Categoria categoria) {
        return categoriaRepo.findProductosByCategoria(categoria.getId());
    }
}
