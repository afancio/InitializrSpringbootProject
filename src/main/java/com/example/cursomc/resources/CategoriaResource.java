/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cursomc.resources;

import com.example.domain.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nti
 */
@RestController //vai ser um controlador Rest
@RequestMapping(value="/categorias") //e vai responder por esse end point aqui ... digitar depois do localHost:8081
public class CategoriaResource {
 
    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> listar(){
        
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");
        
        //list é uma interface e não pode ser instanciado...
        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        
        return lista;
    }
}
