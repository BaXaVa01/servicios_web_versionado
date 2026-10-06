package ni.edu.uam.gestionproducto.controller;

import ni.edu.uam.gestionproducto.dto.CategoriaRequestDTO;
import ni.edu.uam.gestionproducto.entity.Categoria;
import ni.edu.uam.gestionproducto.repository.CategoriaRepository;
import ni.edu.uam.gestionproducto.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaService repository;
    private final CategoriaRepository categoriaRepo;

    public CategoriaController(CategoriaService repository, CategoriaRepository categoriaRepo) {
        this.repository = repository;
        this.categoriaRepo = categoriaRepo;
    }

    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepo.findAll();
    }


    @PostMapping
    public Categoria guardar(@RequestBody CategoriaRequestDTO categoria) {
        return repository.crearEtiqueta(categoria);
    }




}