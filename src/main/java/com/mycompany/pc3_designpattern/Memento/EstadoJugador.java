/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Memento;

/**
 *
 * @author isra-macbook
 */
public class EstadoJugador {
    private final int vida;
    private final String nivel;
    private final String posicion;

    public EstadoJugador(int vida, String nivel, String posicion) {
        this.vida = vida;
        this.nivel = nivel;
        this.posicion = posicion;
    }

    public int getVida() {
        return vida;
    }

    public String getNivel() {
        return nivel;
    }

    public String getPosicion() {
        return posicion;
    }
}
