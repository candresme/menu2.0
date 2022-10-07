package co.menu.config;

import co.menu.entidades.Administrador;
import co.menu.entidades.Categoria;
import co.menu.entidades.Producto;
import co.menu.repositorios.AdministradorRepo;
import co.menu.repositorios.CategoriaRepo;
import co.menu.repositorios.ProductoRepo;
import co.menu.servicios.AdministradorServicio;
import co.menu.servicios.CategoriaServicio;
import co.menu.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InformacionPorDefecto implements CommandLineRunner {

    @Autowired
    private AdministradorServicio adminServicio;

    @Autowired
    private AdministradorRepo administradorRepo;

    @Autowired
    private ProductoServicio productoServicio;

    @Autowired
    private ProductoRepo productoRepo;

    @Autowired
    private CategoriaServicio categoriaServicio;

    @Override
    public void run(String... args) throws Exception {
        Administrador administrador = new Administrador("admin", "admin", "admin");
        administradorRepo.save(administrador);

        Categoria c1 = new Categoria("Comidas", administrador);
        categoriaServicio.crearCategoria(c1);
        Producto p1 = new Producto("Salchipapa", 2000, c1, administrador);
        productoRepo.save(p1);



    }
}
