package org.example.progettospringdata.controller;

import org.example.progettospringdata.db.dao.CategoriaDao;
import org.example.progettospringdata.db.dao.GeneralDao;
import org.example.progettospringdata.db.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaDao categoriaDao;
    @Autowired
    private GeneralDao <Categoria> generalDao;

    @GetMapping("/add")
    public String primoMetodo(){
        generalDao.add(new Categoria("Hobby","per gli appassionati",2));
        return "welcome";
    }

    @GetMapping("/update")
    public String secondoMetodo(){
        generalDao.update(new Categoria("","motori",3));
        return "welcome";
    }

    //@RequestParam = valore dalla query string
    @GetMapping("/delete")
    public String terzoMetodo(@RequestParam("id") int id){
        generalDao.deleteForId(id);
        return "welcome";
    }


    @GetMapping("/nomeById")
    public String quartoMetodo(@RequestParam("id") int id){
        System.out.println (categoriaDao.nomeById(id));
        return "welcome";
    }

    @GetMapping("/selectById")
    public String quintoMetodo(@RequestParam("id") int id){
        System.out.println(generalDao.selectById(id).getNome());
        return "welcome";
    }

    @GetMapping("/selectAll")
    public String sestoMetodo(){
        List<Categoria> lista = generalDao.retrieveAll();
        for(Categoria categoria : lista){
            System.out.println("- "+categoria.getNome());
        }

        return "welcome";
    }
}
