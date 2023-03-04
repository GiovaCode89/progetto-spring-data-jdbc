package org.example.progettospringdata.db.dao.impl;

import org.example.progettospringdata.db.dao.CategoriaDao;
import org.example.progettospringdata.db.dao.GeneralDao;
import org.example.progettospringdata.db.model.Categoria;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class CategoriaDaoImpl implements CategoriaDao, GeneralDao<Categoria> {
    private JdbcTemplate conn;

    private final RowMapper<Categoria> categoriaMapper = (resultSet, rowNum) -> {
        Categoria categoria= new Categoria();
        categoria.setId(resultSet.getInt("id"));
        categoria.setNome(resultSet.getString("nome"));
        categoria.setDescrizione(resultSet.getString("descrizione"));
        categoria.setId_categoria_padre(resultSet.getInt("id_categoria_padre"));
        return categoria;
    };

    public CategoriaDaoImpl(DataSource ds) {
        this.conn = new JdbcTemplate(ds);
    }

    @Override
    public void add(Categoria categoria) {
        conn.update("INSERT INTO categoria(nome,descrizione,id_categoria_padre) VALUES(?, ?, ?)",
                categoria.getNome(),categoria.getDescrizione(),categoria.getId_categoria_padre());

    }

    @Override
    public Categoria retrieveForName(String nome) {
      return null;
    }

    @Override
    public void update(Categoria categoria) {
        conn.update("update categoria set descrizione=? where id=1",categoria.getDescrizione());
    }


    public void deleteForId(int id) {
        conn.update("delete from categoria where id = ?",id);
    }

    @Override
    public Categoria selectById(int id) {
        return conn.queryForObject("select * from categoria where id = ?",categoriaMapper,id);
    }

    @Override
    public String nomeById(int id) {
        return conn.queryForObject("select nome from categoria where id = ?",String.class,id);
    }

    @Override
    public List<Categoria> retrieveAll() {
        return conn.query("select * from categoria",categoriaMapper);
    }
}
