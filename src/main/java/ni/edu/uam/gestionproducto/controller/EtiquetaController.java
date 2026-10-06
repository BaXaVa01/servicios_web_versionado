package ni.edu.uam.gestionproducto.controller;

import ni.edu.uam.gestionproducto.dto.EtiquetaRequestDTO;
import ni.edu.uam.gestionproducto.entity.Etiqueta;
import ni.edu.uam.gestionproducto.repository.EtiquetaRepository;
import ni.edu.uam.gestionproducto.service.EtiquetaService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/etiqueta")
public class EtiquetaController{

    private final EtiquetaService etiqueta;

    public EtiquetaController(EtiquetaService etiqueta) {
        this.etiqueta= etiqueta;
    }


    @PostMapping
    public Etiqueta guardar(@RequestBody EtiquetaRequestDTO etiquetaRequest) {
        return etiqueta.crearEtiqueta(etiquetaRequest);
    }




}

