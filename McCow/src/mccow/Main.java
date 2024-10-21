/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mccow;
import mccow.Pradera.Vaca;

/**
 *
 * @author enrique
 */
public class Main {
    public static void main(String[] args) {
        McCow mcCow = new McCow(); 
        System.out.println("\nINICIO : ");
        System.out.println(mcCow);
        
        //COMPRAMOS MESAS
        System.out.println("# Compramos dos mesas");
            mcCow.comprarMesa();
            mcCow.comprarMesa();
        
        //COMPRAMOS COMIDA
        System.out.println("\n# Compramos dos menus y una simple");
            mcCow.comprarMenuTodas();
            mcCow.comprarMenuTodas();
            mcCow.comprarSimpleTodas();
            mcCow.verInformacionDeTodasMesas();
            
        //MOSTRAMOS INFOMRACION DE LAS MESAS   
            //mcCow.verInformacionDeTodasMesas();
   
            
        //RECIBIMOS EL DINERO Y EXP 
        System.out.println("\n# Recibimos dinero y experiencia de las mesas y limpiamos estas");
            mcCow.recibirDineroExp();
        
        //VENDEMOS MESA
            /*mcCow.venderMesa();
            System.out.println(mcCow);
            mcCow.verInformacionDeTodasMesas();*/
        
        //COMPRAMOS VACA
        System.out.println("\n# Compramos dos vacas");
            mcCow.comprarVaca();
            mcCow.comprarVaca();
            mcCow.verInformacionDePradera();
            //mcCow.verInformacionDePradera();
            //System.out.println(mcCow);
        
        //VENDEMOS VACA
            /*System.out.println("\nVendemos una vaca");
            mcCow.venderVaca();
            System.out.println(mcCow);*/
        
        //COMPRAR BEBIDAS
        System.out.println("\n# Compramos 4 bebidas");
            mcCow.comprarBebidas();
            mcCow.comprarBebidas();
            mcCow.comprarBebidas();
            mcCow.comprarBebidas();
        
        
        //RECOGER FILETES
        System.out.println("\n# Añadimos filetes");
            mcCow.anadirFiletes();
        
        //MOSTRAMOS INFORMACION
        System.out.println("\nFIN : ");
        System.out.println(mcCow);
        
        System.out.println("# Mesas 'Limpias' : \n");
        mcCow.verInformacionDeTodasMesas();
        
    }
}
