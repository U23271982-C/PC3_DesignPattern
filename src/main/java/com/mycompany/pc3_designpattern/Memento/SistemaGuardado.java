/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Memento;

import java.util.Stack;

/**
 *
 * @author isra-macbook
 */
public class SistemaGuardado {
    private final Stack<EstadoJugador> historial = new Stack<>();

    public void guardar(EstadoJugador estado) {
        historial.push(estado);
    }

    public EstadoJugador deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        } else {
            System.out.println("No hay más puntos de guardado.");
            return null;
        }
    }

    public boolean hayGuardado() {
        return !historial.isEmpty();
    }
}
