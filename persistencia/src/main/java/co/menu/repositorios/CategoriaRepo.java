package co.menu.repositorios;

import co.menu.entidades.Categoria;
import co.menu.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepo extends JpaRepository<Categoria, String> {

    Categoria findByNombre(String nombre);

    @Query("select p from Producto p where p.categoria.id = ?1")
    List<Producto> findProductosByCategoria(int idCategoria);


}
