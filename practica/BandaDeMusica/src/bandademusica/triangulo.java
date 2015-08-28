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
public class triangulo extends percusion {
    
    public triangulo(){
        super();
        nombre="Triangulo";
        tipo_nota="sol";
    }
    
    public void  triangulo(){
        System.out.println("Mi nombre es:" + nombre + "Mi  Nota Es:" +tipo_nota);
    }
}
