package co.menu.servicios;

import co.menu.entidades.Administrador;
import co.menu.repositorios.AdministradorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServicioImpl implements AdministradorServicio{

    @Autowired
    private AdministradorRepo adminRepo;

    @Override
    public Administrador crearAdministrador(Administrador administrador) {
        return adminRepo.save(administrador);
    }
}
