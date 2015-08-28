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
public class guitarra extends TFlauta {
    
    public guitarra(){
        super();
        nombre="Guitarra";
        tipo_nota="re";
    }
    
       @Override
       public void  MostrarTono()
       {
           System.out.println(" Mi nombre es:" + nombre + "  Mi nota es: " + tipo_nota);
       }
    
}
