package org.example.progettospringdata.db.dao.impl;

import org.example.progettospringdata.db.dao.ClienteDao;
import org.example.progettospringdata.db.dao.GeneralDao;
import org.example.progettospringdata.db.model.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class ClienteDaoImpl implements ClienteDao, GeneralDao<Cliente> {
    private JdbcTemplate conn;

    private final RowMapper<Cliente> clienteMapper = (resultSet, rowNum) -> {
        return new Cliente();
    };

    public ClienteDaoImpl(DataSource ds) {
        this.conn = new JdbcTemplate(ds);
    }

    @Override
    public void add(Cliente cliente) {
        conn.update("insert into cliente(nome,cognome) values(?,?)",
               cliente.getNome(),cliente.getCognome());
    }

    @Override
    public void update(Cliente cliente) {
        conn.update("update cliente set cognome=? where id=0",cliente.getCognome());
    }


    public void deleteForId(int id) {
        conn.update("delete from cliente where id = ?",id);
    }

    @Override
    public Cliente selectById(int id) {
        return  null;
    }

    @Override
    public String getTelefonoByNomeAndCognome(String nome, String cognome) {
        return conn.queryForObject("select telefono from cliente where nome = ? And cognome = ?",
                                    String.class,
                                    nome,
                                    cognome);
    }

    @Override
    public List<Cliente> retrieveAll() {
        return null;
    }
}
