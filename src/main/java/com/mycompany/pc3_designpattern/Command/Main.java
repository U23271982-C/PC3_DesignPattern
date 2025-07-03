/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Command;

/**
 *
 * @author isra-macbook
 */
public class Main {
    public static void main(String[] args) {
        // Receptores
        Luz luz = new Luz();
        Televisor tv = new Televisor();

        // Comandos
        Comando encenderLuz = new EncenderLuz(luz);
        Comando apagarTV = new ApagarTV(tv);

        // Invocador
        ControlRemoto control = new ControlRemoto();

        // Cliente configura el control remoto
        control.setComando(encenderLuz);
        control.presionarBoton();  // Luz encendida

        control.setComando(apagarTV);
        control.presionarBoton();  
    }
}
