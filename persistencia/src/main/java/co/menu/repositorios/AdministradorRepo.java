package co.menu.repositorios;

import co.menu.entidades.Administrador;
import co.menu.entidades.Categoria;
import co.menu.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministradorRepo extends JpaRepository<Administrador, String> {


    @Query("select c from Categoria c where c.administrador.nickname = ?1")
    List<Categoria> listarCategorias(String nickAdmin);


    @Query("select p from Producto p where p.categoria.id = ?1 and p.administrador.nickname = ?2")
    List<Producto> listarProductosCategoria(String id_categoria, String nickAdmin);

}
