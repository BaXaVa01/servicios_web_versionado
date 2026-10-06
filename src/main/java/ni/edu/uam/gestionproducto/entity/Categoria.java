package ni.edu.uam.gestionproducto.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre_categoria;

    private boolean activa;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
    // Getters y Setters
}