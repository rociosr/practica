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
public class barbiton  extends cuerda{
    
    public  barbiton(){
        super();
        nombre="barbiton";
        tipo_nota="fa";
    }
  
    
    @Override
  public   void MostrarTono(){
        System.out.println("Soy el Istrumento" + nombre + "Mi Nota Es:" + tipo_nota);
    }
    
}
