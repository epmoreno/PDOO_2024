/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mccow;
/**
 *
 * @author enrique
 * 
 * Clase Principal
 */
public class McCow {
   private Vestibulos vestibulos;
   private CampoVacas campoVacas;
   private AutoCow autoCow;
   
   public McCow (){
       this.vestibulos = new Vestibulos( new Mesas(), new Bebidas() ,new Empleados() );
       this.campoVacas = new CampoVacas();
       this.autoCow = new AutoCow();
   }
    
}

/**
 * 
 * @author enrique
 * 
 * Creacion del Vestibulo
 */
class Vestibulos{
    protected Mesas mesas;
    protected Bebidas bebidas;
    protected Empleados empleados;
    
    public Vestibulos(Mesas mesas,Bebidas bebidas,Empleados empleados){
        this.mesas = mesas;
        this.bebidas = bebidas;
        this.empleados = empleados;
    }
}
class Mesas{
    
    public static final String ICONO = " ";
    public static final int DURACION = 2;
    public static final int EXPERIENCIA = 1;
    public static final int PRECION_VENTA = 2;
    
    private String icono;
    private int duracionMesa;
    private int experienciaRecolectada;
    private int precioVenta;
    //private int n_mesa;
    
    
    public Mesas(){
        this.icono = ICONO;
        this.duracionMesa = DURACION;
        this.experienciaRecolectada = EXPERIENCIA;
        this.precioVenta = PRECION_VENTA;
    }
    public Mesas(String icono, int duracionMesa, int experienciaRecolectada, int precioVenta){
        this.icono = icono;
        this.duracionMesa = duracionMesa;
        this.experienciaRecolectada = experienciaRecolectada;
        this.precioVenta = precioVenta;
    }

}
// PENSABER LA IMLPEMENATACION DE BEBIDAS
class Bebidas{
    public static final String ICONO = " ";
    public static final int EXPERIENCIA = 1;
    public static final int PRECION_VENTA = 2;
    
    private String icono;
    private int experienciaRecolectada;
    private int precioVenta;
    //private int n_bebidas;
    
    public Bebidas(){
        this.icono = ICONO;
        this.experienciaRecolectada = EXPERIENCIA;
        this.precioVenta = PRECION_VENTA;
    }
    public Bebidas(String icono, int experienciaRecolectada, int precioVenta){
        this.icono = icono;
        this.experienciaRecolectada = experienciaRecolectada;
        this.precioVenta = precioVenta;
    }

}
class Empleados {
    public static final String ICONO = " ";
    public static final int PRECION_VENTA = 2;
    
    private String icono;
    private int precioVenta;
    public Empleados(){
        this.icono = ICONO;
        this.precioVenta = PRECION_VENTA;
    }
    public Empleados(String icono, int precioVenta){
        this.icono = icono;
        this.precioVenta = precioVenta;
    }

}

/**
 * 
 * @author enrique
 * 
 * Creacion del Campo de Vacas
 */

class CampoVacas{
    
}

/**
 * 
 * @author enrique
 * 
 * Creacion del AutoCow
 */
class AutoCow {
    
}
