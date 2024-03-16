package edu.upc.maestro.entites;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("provincia")
public class Provincia {
    private String cod_departamento;
    private String cod_provincia;
    private String nombre;
}
