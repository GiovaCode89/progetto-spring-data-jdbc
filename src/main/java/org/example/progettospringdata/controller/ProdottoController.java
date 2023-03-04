package org.example.progettospringdata.controller;

import org.example.progettospringdata.db.dao.GeneralDao;
import org.example.progettospringdata.db.dao.ProdottoDao;
import org.example.progettospringdata.db.model.Prodotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prodotto")
public class ProdottoController {
    @Autowired
    private ProdottoDao prodottoDao;
    @Autowired
    private GeneralDao generalDao;

    @GetMapping("/add")
    public String primoMetodo(){
        generalDao.add(new Prodotto("God of war","videogame"));
        return "welcome";
    }
}
