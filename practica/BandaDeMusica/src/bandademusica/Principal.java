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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Instrumentos []mus = new Instrumentos[5];
        mus[0]=new TFlauta();
        mus[1]=new guitarra();
        mus[2]=new arcopercutor();
        mus[3]=new barbiton();
        mus[4]=new triangulo();
        for(int i=0;i <mus.length;i++){
              mus[i].MostrarTono();
       
    }
    }
    
}
