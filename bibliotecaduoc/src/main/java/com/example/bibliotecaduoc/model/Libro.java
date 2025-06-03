package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Libro {
    

public int id;
private String isbn;
private String titulo;
private String editorial;
private int fechaPublicacion;
private String autor;


}
