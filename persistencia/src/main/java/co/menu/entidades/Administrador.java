package co.menu.entidades;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@ToString
public class Administrador {


    @Id
    @Column(name="nickname", nullable = false)
    @EqualsAndHashCode.Include
    private String nickname;


    @Column(name="email")
    @NotBlank
    private String email;

    @Column(name="contrasena", nullable = false)
    @NotBlank
    private String contrasena;

    @Column(name="foto")
    private String foto;

    @Column(name="nombre")
    private String nombre;

    @OneToMany(mappedBy = "administrador")
    @ToString.Exclude
    @JsonIgnore
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "administrador")
    @ToString.Exclude
    @JsonIgnore
    private List<Producto> productos;

    public Administrador(String nickname, String email, String contrasena) {
        this.nickname = nickname;
        this.email = email;
        this.contrasena = contrasena;
    }
}