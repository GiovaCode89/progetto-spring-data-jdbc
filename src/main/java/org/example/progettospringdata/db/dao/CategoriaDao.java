package org.example.progettospringdata.db.dao;

import org.example.progettospringdata.db.model.Categoria;

public interface CategoriaDao {
    public Categoria retrieveForName(String nome);
    public String nomeById(int id);
}
