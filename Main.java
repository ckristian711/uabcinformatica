/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccionyherencia;

/**
 *
 * @author clases
 */
public class Main {
    public static void main(String[] args) {
        //Generamos instancia de persona y estudiante
        
        Personas pepe = new Personas();
        pepe.nombre = "Jose";
        pepe.apellidoPaterno = "Perez";
        pepe.correr();
        
        Estudiante analy = new Estudiante("Analy", 359212);
        analy.estudiar(); 
        analy.exponer();
        System.out.println("Dinero Disponible: "+ pepe.dinero);
       // analy.dinero = 2500000;
    }
    
}
