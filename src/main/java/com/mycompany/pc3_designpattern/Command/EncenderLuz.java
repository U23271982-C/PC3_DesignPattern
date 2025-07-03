/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Command;

/**
 *
 * @author isra-macbook
 */
public class EncenderLuz implements Comando {
    private final Luz luz;

    public EncenderLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }
}
