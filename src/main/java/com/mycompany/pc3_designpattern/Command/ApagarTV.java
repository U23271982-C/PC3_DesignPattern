/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Command;

/**
 *
 * @author isra-macbook
 */
public class ApagarTV implements Comando {
    private final Televisor tv;

    public ApagarTV(Televisor tv) {
        this.tv = tv;
    }

    @Override
    public void ejecutar() {
        tv.apagar();
    }
}
