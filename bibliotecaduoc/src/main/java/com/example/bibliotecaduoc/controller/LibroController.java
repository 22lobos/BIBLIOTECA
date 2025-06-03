package com.example.bibliotecaduoc.controller;


import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.service.LibroServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroServise libroServise;
    @GetMapping
    public List<Libro> listarLibros() {
        return libroServise.obtenerLibros();


    }    @GetMapping("/{id}")
    public Libro agregaLibro(@RequestBody Libro libro) {
        return libroServise.saveLibro(libro);
        
        
    } 
    @GetMapping("/{id}")
    public Libro actualizaLibro(@PathVariable int id, @RequestBody Libro libro) {
        
        return libroServise.updateLibro(libro);
        
        
    }
    @GetMapping("/{id}")
    
    public String eliminaLibro(@PathVariable int id) {
        return libroServise.deleteLibro(id);
        
    }


    
}
