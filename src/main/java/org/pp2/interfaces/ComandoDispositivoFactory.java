package org.pp2.interfaces;

public interface ComandoDispositivoFactory {
    boolean isCompatible(Dispositivo dispositivo);
    ComandoDispositivo create();
}
