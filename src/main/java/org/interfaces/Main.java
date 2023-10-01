package org.interfaces;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo("s2","SAMSUNG", "AirConditioner") {
            @Override
            public void ejecutar(String comando) {
                System.out.printf("Ejecutando comando %s para dispositivo %s modelo %s%n", comando, this.getNombre(), this.getModelo());
            }
        };
        dispositivo.ejecutar("APAGAR");
    }
}