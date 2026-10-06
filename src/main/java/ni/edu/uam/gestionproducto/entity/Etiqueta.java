package ni.edu.uam.gestionproducto.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "etiqueta")
public class Etiqueta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    // Getters y Setters
}