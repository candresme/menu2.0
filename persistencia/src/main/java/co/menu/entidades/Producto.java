package co.menu.entidades;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@ToString

public class Producto {

    @Id
    @Column(name="id",nullable = false, length = 25)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private int id;

    @Column(name="nombre",nullable = false, length = 50)
    private String nombre;

    @Column(name="imagen", length = 200)
    private String imagen;

    @Column(name="precio")
    private int precio;

    @Column(name="descripcion", length = 200)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name="id_admin")
    private Administrador administrador;

    public Producto(String nombre, int precio, Categoria categoria, Administrador administrador) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.administrador = administrador;
    }
}
