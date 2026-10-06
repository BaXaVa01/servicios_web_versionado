package ni.edu.uam.gestionproducto.repository;

import ni.edu.uam.gestionproducto.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository
        extends JpaRepository<Categoria, Integer> {
}