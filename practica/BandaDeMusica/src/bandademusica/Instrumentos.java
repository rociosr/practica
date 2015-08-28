/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandademusica;

/**
 *
 * @author Rosy
 */
//tipo=nombre
public class Instrumentos {
     public  String tipo_nota;
     public String nombre;
    
    public void MostrarTono()
    {
       System.out.println("Soy el Instrumeto"  +  nombre +  "  Mi tono Es:" + tipo_nota); 
        
    }
}
