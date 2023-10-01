package org.pp2;

public interface ComandoDispositivoFactory {
    boolean isCompatible(Dispositivo dispositivo);
    ComandoDispositivo create();
}
