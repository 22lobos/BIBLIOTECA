package com.example.bibliotecaduoc.service;
import org.springframework.stereotype.Service;
import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.stereotype.service;


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


}
