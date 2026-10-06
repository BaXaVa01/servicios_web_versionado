package ni.edu.uam.gestionproducto.controller;

import ni.edu.uam.gestionproducto.dto.EtiquetaRequestDTO;
import ni.edu.uam.gestionproducto.entity.Etiqueta;
import ni.edu.uam.gestionproducto.repository.EtiquetaRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/etiqueta")
public class EtiquetaController{

    private final EtiquetaRepository etiqueta;

    public EtiquetaController(EtiquetaRepository etiqueta) {
        this.etiqueta= etiqueta;
    }


    @PostMapping
    public Etiqueta guardar(@RequestBody EtiquetaRequestDTO etiqueta) {
        return etiqueta.save(etiqueta);
    }




}

