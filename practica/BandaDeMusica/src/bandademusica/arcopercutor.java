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
public class arcopercutor  extends cuerda{
    
    public arcopercutor(){
        super();
        nombre="arco percutor";
        tipo_nota="mi";
    }
    
    
    @Override
    public void MostrarTono(){
        System.out.println("Soy el Instrumento" + nombre + "Mi nota Es:" + tipo_nota);
    }
}
