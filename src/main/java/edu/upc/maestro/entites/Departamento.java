package edu.upc.maestro.entites;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("departamento")
public class Departamento {
    @Id
    private String cod_departamento;
    private String nombre;
}
