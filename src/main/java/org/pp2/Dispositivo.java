package org.pp2;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Dispositivo {

    private String id;
    private String modelo;
    private String nombre;

    abstract void ejecutar(String comando);
}
