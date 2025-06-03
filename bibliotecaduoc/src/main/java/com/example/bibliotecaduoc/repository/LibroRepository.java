package com.example.bibliotecaduoc.repository;
import org.springframework.stereotype.Repository;
import com.example.bibliotecaduoc.model.Libro;
import java.util.List;
import java.util.ArrayList;




@Repository
public class LibroRepository {

private List<Libro>  listarLibros = new ArrayList<>();

public List<Libro> obteLibros() {
    return listarLibros;
    }

    public Libro buscarPorId(int id ){
        for (Libro libro : listarLibros){
            if (libro.getId() == id) {
                return libro;
            }
        }

        return null;
    }   
    
    
    
    }

    

