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
public class TFlauta extends aire {
    
    public  TFlauta()
    {
               super();
              tipo_nota="Do";
              nombre="Flauta";
        
        
    }
   
    @Override
    public void MostrarTono(){
       System.out.println( "Mi nombre es: "  + nombre  + " Mi nota es:"  + tipo_nota);
    }
    void MostrarNotas(){
     System.out.println("Mi nombre es: "  + nombre  + " Mi nota es:"  + tipo_nota);   
    }
}