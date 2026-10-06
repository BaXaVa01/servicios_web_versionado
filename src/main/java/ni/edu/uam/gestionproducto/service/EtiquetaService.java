package ni.edu.uam.gestionproducto.service;

import ni.edu.uam.gestionproducto.dto.EtiquetaRequestDTO;
import ni.edu.uam.gestionproducto.entity.Etiqueta;
import ni.edu.uam.gestionproducto.repository.EtiquetaRepository;
import org.springframework.stereotype.Service;

@Service
public class EtiquetaService {

    private final EtiquetaRepository etiquetaRepostiory;

    public EtiquetaService(EtiquetaRepository etiquetaRepostiory) {
        this.etiquetaRepostiory = etiquetaRepostiory;
    }

    public Etiqueta crearEtiqueta(EtiquetaRequestDTO dto) {
        Etiqueta etiqueta = new Etiqueta();

        etiqueta.setNombre(dto.getNombre());

        return etiquetaRepostiory.save(etiqueta);
    }
}