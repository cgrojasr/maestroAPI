package edu.upc.maestro.controllers;

import edu.upc.maestro.entites.Departamento;
import edu.upc.maestro.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ubigeo")
public class UbigeroController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/departamento")
    public List<Departamento> findAll(){
        return departamentoService.findAll();
    }
}
