package ni.edu.uam.gestionproducto.service;

import ni.edu.uam.gestionproducto.dto.CategoriaRequestDTO;
import ni.edu.uam.gestionproducto.entity.Categoria;
import ni.edu.uam.gestionproducto.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository1) {
        this.repository= repository1;
    }

    public Categoria crearEtiqueta(CategoriaRequestDTO dto) {
        Categoria categoria = new Categoria();

        categoria.setNombre_categoria(dto.getNombre_categoria());
        categoria.setActiva(dto.isActiva());

        return repository.save(categoria);
    }
}