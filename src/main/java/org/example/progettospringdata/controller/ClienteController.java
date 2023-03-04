package org.example.progettospringdata.controller;

import org.example.progettospringdata.db.dao.ClienteDao;
import org.example.progettospringdata.db.dao.GeneralDao;
import org.example.progettospringdata.db.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteDao clienteDao;
    @Autowired
    private GeneralDao generalDao;

    @GetMapping("/add")
    public String primoMetodo(){
        generalDao.add(new Cliente("Paolo","Rossi"));
        return "welcome";
    }

    @GetMapping("selectTelefonoByNomeAndCognome")
    public String secondoMetodo(){
        System.out.println(clienteDao.getTelefonoByNomeAndCognome("Paolo","Rossi"));
        return "welcome";
    }
}
