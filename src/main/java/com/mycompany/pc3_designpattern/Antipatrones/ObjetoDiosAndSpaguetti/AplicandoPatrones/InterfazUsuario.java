/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc3_designpattern.Antipatrones.ObjetoDiosAndSpaguetti.AplicandoPatrones;

/**
 *
 * @author isra-macbook
 */
public class InterfazUsuario {
    private final Dron dron = new Dron();
    private final Comunicacion com = new Comunicacion();

    public void mostrarMenu() {
        System.out.println("1. Volar\n2. Tomar Foto\n3. Enviar Datos");
        // Aquí solo escanea input y llama a los objetos responsables
    }
}
