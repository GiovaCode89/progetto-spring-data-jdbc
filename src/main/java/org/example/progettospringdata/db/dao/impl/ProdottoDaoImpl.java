package org.example.progettospringdata.db.dao.impl;

import org.example.progettospringdata.db.dao.GeneralDao;
import org.example.progettospringdata.db.dao.ProdottoDao;
import org.example.progettospringdata.db.model.Prodotto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class ProdottoDaoImpl implements ProdottoDao, GeneralDao<Prodotto> {
    private JdbcTemplate conn;
    private final RowMapper <Prodotto> prodottoMapper = (resultSet, rowNum) -> {
                                                                                      return new Prodotto();
                                                                                  };
    public ProdottoDaoImpl(DataSource ds) {
        this.conn = new JdbcTemplate(ds);
    }

    @Override
    public void add(Prodotto prodotto) {
        conn.update("insert into prodotto(nome,descrizione) values(?,?)",
                prodotto.getNome(),prodotto.getDescrizione());
    }

    @Override
    public void update(Prodotto prodotto) {
        conn.update("update prodotto set nome=? where id=0",prodotto.getNome());
    }

    @Override
    public void deleteForId(int id) {
        conn.update("delete from prodotto where id = ?",id);
    }

    @Override
    public Prodotto selectById(int id) {
        return null;
    }

    @Override
    public List<Prodotto> retrieveAll() {
        return null;
    }
}
