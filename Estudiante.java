/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccionyherencia;

/**
 *Clase que representa un estudiante que hereda caracteristicas de la persona
 * @author clases
 */
public class Estudiante  extends Personas{
  
    public Integer matricula;
    public String[] carrera;
    public String [] facultad;

  /*  public Estudiante(Integer matricula) {
        this.matricula = matricula;
    }*/
    public Estudiante(String nombre, Integer matricula){
       //la siguiiente linea permite que cuando se genere estudiante
       //se llama a persona (nombre)
        super(nombre);
        this.nombre = nombre;
        this.matricula = matricula;
        
        
       // public void Estudiar(){
        //    System.out.println("Estudiando");
      //  }
    }
}