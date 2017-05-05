/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11ejercicio01;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author alumno
 */
public class Menu {
    
    private ArrayList<String> comidas;

    public Menu() {   
        this.comidas = new ArrayList<String>();        
    }

    // add the methods here
    public void agregarComida(String comida) {       
       this.comidas.add(comida);
       HashSet hs=new HashSet();
       hs.addAll(this.comidas);
       this.comidas.clear();
       this.comidas.addAll(hs);        
    }
    
    public void imprimirComidas(){
        for(String Comidas:this.comidas){
            System.out.println(Comidas);
        }
    }
       
    
    public void limpiarMenu(){
        (this.comidas).clear();
    }
}
