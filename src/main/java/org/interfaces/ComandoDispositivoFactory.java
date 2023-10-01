package org.interfaces;

public interface ComandoDispositivoFactory {
    boolean isCompatible(Dispositivo dispositivo);
    ComandoDispositivo create();
}
