package co.menu.repositorios;

import co.menu.entidades.Categoria;
import co.menu.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, String> {

    Producto findById(int id);
}
