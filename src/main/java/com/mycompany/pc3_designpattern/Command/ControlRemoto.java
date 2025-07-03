/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Command;

/**
 *
 * @author isra-macbook
 */
public class ControlRemoto {
    private Comando boton;

    public void setComando(Comando comando) {
        this.boton = comando;
    }

    public void presionarBoton() {
        if (boton != null) {
            boton.ejecutar();
        }
    }
}
