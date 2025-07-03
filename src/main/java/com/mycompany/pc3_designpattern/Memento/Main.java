/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Memento;

/**
 *
 * @author isra-macbook
 */
public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(100, "Templo del Fuego", "Entrada");
        SistemaGuardado sistema = new SistemaGuardado();

        jugador.mostrarEstado(); // Muestra el estado del jugador que recién hemos creado
        sistema.guardar(jugador.crearMemento()); // Se guarda el progreso del jugador

        jugador.recibirDano(40);
        jugador.avanzar("Pasillo Ardiente");
        jugador.mostrarEstado();

        jugador.recibirDano(50);
        jugador.avanzar("Camino de Rocas");
        jugador.mostrarEstado();

        System.out.println("\nRestaurando último punto de guardado...");
        if (sistema.hayGuardado()) { // Se verifica que si hay una cola de gurados (estado)
            jugador.restaurarDesdeMemento(sistema.deshacer()); // Te lleva al último estado
            jugador.mostrarEstado();
        }
    }
}
