package edu.fiuba.algo3;

public class BloqueAbajo implements IAccion {

    @Override
    public void ejecutar(Personaje personaje){
        personaje.moverAbajo();
    }

    @Override
    public void ejecutarInversa(Personaje personaje){
        new BloqueArriba().ejecutar(personaje);
    }
}
