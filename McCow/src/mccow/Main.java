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
        System.out.println(mcCow);
        
        mcCow.comprarMesa();
        mcCow.comprarMesa();
        mcCow.comprarMesa();
       
        mcCow.comprarMenuTodas();
        mcCow.comprarMenuTodas();
        mcCow.comprarSimpleTodas();
         
        //mcCow.verInformacionDeTodasMesas();
        mcCow.recibirDineroExp();
        //mcCow.verInformacionDeTodasMesas();
        
        System.out.println(mcCow);
        
        /*mcCow.verMesa(1);
        mcCow.verMesa(0);*/
        
        
        //mcCow.venderMesa();
        
        //mcCow.informacion();
    }
}
