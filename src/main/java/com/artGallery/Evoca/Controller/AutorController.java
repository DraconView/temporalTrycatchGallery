package com.artGallery.Evoca.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.artGallery.Evoca.Model.Autor;
import com.artGallery.Evoca.Service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }

    @GetMapping("/{id}")
    public Autor obtenerAutorPorId(@PathVariable Long id) {
        return autorService.obtenerAutorPorId(id);
    }

    @PutMapping("/{id}")
    public Autor actualizarAutor(@PathVariable Long id, @RequestBody Autor autor) {
        return autorService.actualizarAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id) {
        autorService.eliminarAutor(id);
    }
}
