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
    
    
    public Libro guardar(Libro lib){
        listarLibros.add(lib);
        return lib;
    }

    public Libro actualizar(Libro lib){
        int id = 0;
         int idPosicion = 0;

    for (int i = 0; i < listarLibros.size(); i++) {
        if (listarLibros.get(i).getId() == lib.getId()) {
            id = lib.getId();
            idPosicion = i;
            
        }
    }
    
     Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listarLibros.set(idPosicion, libro1);
        return libro1;





}

    
    }

    

