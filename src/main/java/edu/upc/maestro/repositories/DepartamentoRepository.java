package edu.upc.maestro.repositories;

import edu.upc.maestro.entites.Departamento;
import edu.upc.maestro.models.DepartamentoItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository extends MongoRepository<Departamento, String> {
}
