package co.menu.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@ToString
public class Categoria {

    @Id
    @Column(name="id",nullable = false, length = 25)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private int id;

    @Column(name="nombre",nullable = false, length = 50)
    private String nombre;

    @Column(name="descripcion", length = 200)
    private String descripcion;

    @Column(name="estado")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name="id_administrador")
    private Administrador administrador;

    @OneToMany(mappedBy = "categoria")
    @ToString.Exclude
    @JsonIgnore
    private List<Producto> productos;

    public Categoria(String nombre, Administrador administrador) {
        this.nombre = nombre;
        this.administrador = administrador;
    }
}
