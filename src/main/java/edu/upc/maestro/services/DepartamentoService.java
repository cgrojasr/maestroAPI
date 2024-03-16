package edu.upc.maestro.services;

import edu.upc.maestro.entites.Departamento;
import edu.upc.maestro.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> findAll(){
        return departamentoRepository.findAll();
    }
}
