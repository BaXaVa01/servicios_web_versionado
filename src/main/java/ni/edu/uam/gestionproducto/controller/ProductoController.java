package ni.edu.uam.gestionproducto.controller;

import ni.edu.uam.gestionproducto.dto.ProductoRequestDTO;
import ni.edu.uam.gestionproducto.entity.Etiqueta;
import ni.edu.uam.gestionproducto.entity.Producto;
import ni.edu.uam.gestionproducto.repository.ProductoRepository;
import ni.edu.uam.gestionproducto.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/{idProducto}/{idEtiqueta}")
    public Producto crearEtiqueta(
            @PathVariable Integer idProducto, @PathVariable Integer idEtiqueta
    ) {
        return productoService.agregarEtiqueta(idProducto, idEtiqueta);

    }

    @GetMapping
    public List<Producto> listar() {
        return productoService.listar();
    }

    @GetMapping("/{id}")
    public Producto buscar(@PathVariable Integer id) {
        return productoService.buscarPorId(id);
    }

    @PostMapping
    public Producto guardar(
            @RequestBody ProductoRequestDTO dto) {

        return productoService.guardar(dto);
    }

    @GetMapping("/etiqueta/{etiquetaId}")
    public List<Producto> listarPorEtiqueta(
            @PathVariable Integer etiquetaId) {

        return productoService.listarPorEtiqueta(etiquetaId);
    }

    @PutMapping("/{id}")
    public Producto actualizar(
            @PathVariable Integer id,
            @RequestBody ProductoRequestDTO dto) {

        return productoService.actualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(
            @PathVariable Integer id) {

        productoService.eliminar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Producto> listarPorCategoria(
            @PathVariable Integer categoriaId) {

        return productoService
                .listarPorCategoria(categoriaId);
    }

}