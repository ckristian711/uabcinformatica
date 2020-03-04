/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccionyherencia;

/**
 *Clase que representa una persona 
 * @author clases
 */
public class Personas {
public String nombre;
public String apellidoMaterno;
public String apellidoPaterno;
public int edad;
public int estatura;

//Haciendo uso de la palabra reservada final
//Se reserva una caracteristica

public final double dinero = 250000;

public Personas(){
    super();
    System.out.println("Generando persona...");
}
 public Personas(String nombre){
    this.nombre = nombre;
    System.out.println("Generando a  "+ nombre);
    
}
    
 
    public void comer(){
        System.out.println("Comiendo..."); 
    }
    public void correr(){
        System.out.println("Corriendo..");
    }
    public void caminar(){
        System.out.println("Caminando...");
    }
    public void descansar(){
        System.out.println("Descansando...");  
    }
    public  void hablar(){
        System.out.println("Hablando...");
    }
    public void estudiar(){
        System.out.println("Estudiando...");
    }
    public void exponer(){
        System.out.println("Exponiendo...");
  
    }
    
    
 }
