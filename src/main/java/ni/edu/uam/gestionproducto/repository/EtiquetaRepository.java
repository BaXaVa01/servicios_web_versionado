package ni.edu.uam.gestionproducto.repository;

import ni.edu.uam.gestionproducto.entity.Etiqueta;
import ni.edu.uam.gestionproducto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtiquetaRepository
        extends JpaRepository<Etiqueta, Integer> {

}
