package edu.upc.maestro.entites;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("distrito")
public class Distrito {
    private String cod_departamento;
    private String cod_provincia;
    private String cod_distrito;
    private String nombre;
}
