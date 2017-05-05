/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11ejercicio01;

/**
 *
 * @author alumno
 */
public class S11ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu menuHoy = new Menu();
        
        System.out.println("MENU 1");
        menuHoy.agregarComida("Ensalada");
        menuHoy.agregarComida("Lomo Saltado");
        menuHoy.agregarComida("Arroz con Pollo");
        menuHoy.agregarComida("Pollo a la Brasa");
      
        menuHoy.imprimirComidas();

        menuHoy.limpiarMenu();
        
        System.out.println("");
        System.out.println("MENU 2");
        menuHoy.agregarComida("Seco de Pollo");
        menuHoy.agregarComida("Arroz Chaufa");
        menuHoy.agregarComida("Tallarin Saltado");
        menuHoy.agregarComida("Ceviche");
        menuHoy.imprimirComidas();
    }
    
}
