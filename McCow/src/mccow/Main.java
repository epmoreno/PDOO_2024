/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mccow;

/**
 *
 * @author enrique
 */
public class Main {
    public static void main(String[] args) {
        McCow mcCow = new McCow();
        
        // TEST DE FUNCIONES: 
        mcCow.informacion();
        
        mcCow.comprarMesa();
        mcCow.comprarMesa();
       
        mcCow.comprarMenu();
        mcCow.comprarMenu();
        mcCow.comprarSimple();
          
        mcCow.informacion();
        
        mcCow.verPedidoDeTodasMesas();
        
        mcCow.verGananciasEnCurso();
        
        System.out.println();
        
        mcCow.verExpEnCurso();
        
        //mcCow.venderMesa();
        
        //mcCow.informacion();
    }
}
