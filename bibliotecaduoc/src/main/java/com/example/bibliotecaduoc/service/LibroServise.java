package com.example.bibliotecaduoc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;



import java.util.List;



@Service
public class LibroServise {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> obtenerLibros() {
        return libroRepository.obteLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }


    public Libro getLibroById(int id) {
        return libroRepository.buscarPorId(id);
    }
    public Libro  updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }
    public String deleteLibro(int id) {
    libroRepository.eliminar(id);
    return "Libro eliminado con exito";
    }



}
