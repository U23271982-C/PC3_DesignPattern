/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Memento;

/**
 *
 * @author isra-macbook
 */
public class Jugador {
    private int vida;
    private String nivel;
    private String posicion;
    private EstadoJugador estadoJugador;

    public Jugador(int vida, String nivel, String posicion) {
        this.vida = vida;
        this.nivel = nivel;
        this.posicion = posicion;
    }

    public EstadoJugador crearMemento() { // Crea el esado del jugador
        return new  EstadoJugador(vida, nivel, posicion);
    }

    public void restaurarDesdeMemento(EstadoJugador memento) { // Da estado nuevamente al jugador
        this.vida = memento.getVida();
        this.nivel = memento.getNivel();
        this.posicion = memento.getPosicion();
    }

    public void recibirDano(int dano) {
        this.vida = Math.max(vida - dano, 0);
    }

    public void avanzar(String nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    public void mostrarEstado() {
        System.out.println("Jugador → Vida: " + vida + ", Nivel: " + nivel + ", Posición: " + posicion);
    }
}
