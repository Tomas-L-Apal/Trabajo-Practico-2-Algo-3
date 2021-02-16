package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public interface IObservaMovimientos {

    void avisarMovimiento(Posicion posicion1, Posicion posicion2);

    ArrayList<Posicion> obtenerMovimientos();
}