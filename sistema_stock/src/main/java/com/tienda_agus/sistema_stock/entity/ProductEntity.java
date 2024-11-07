package com.tienda_agus.sistema_stock.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "productos")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {

    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;

}
