/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nti
 */
@RestController //vai ser um controlador Rest
@RequestMapping(value="/categorias") //e vai responder por esse end point aqui
public class CategoriaResource {
 
    @RequestMapping(method=RequestMethod.GET)
    public String listar(){
        return "REST está funcionando";
    }
}
