/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author Jared
 */
public class Transportes {
    public static void main(String[]args){
        //crear un Vehiculo terrestre
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre(": Matel", ": Terreneitor", 4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico(": Lancha", ": Yamaha", ": Motor prr prr");
        VehiculoAereo vehiculoAereo=new VehiculoAereo(": Americana boeing", ": Vendo", 3);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial(": Nasa", ": 520", ": Motor Turbo");

        
        //Mostrar informacion de los Vehiculos
        System.out.println(" Informacion del Vehiculo Terrestre");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Informacion del Vehiculo Acuatico");
        vehiculoAcuatico.mostrarInfo();
        
        System.out.println("Informacion del Vehiculo Aereo");
        vehiculoAereo.mostrarInfo();
        
        System.out.println("Informacion del Vehiculo Espacial");
        vehiculoEspacial.mostrarInfo();
    }
}
