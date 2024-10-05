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

enum NIVELES{INICIAL,INTERMEDIO,DIFICIL}
enum MENU{HYB,HS}

public class McCow {
    public static final String BARRA_ESTADO = " ";
    public static final NIVELES NIVEL_INICIAL = NIVELES.INICIAL;
    public static final int PRECION_VENTA = 2;
    
    
    private Vestibulos vestibulos;
    private CampoVacas campoVacas;
    private AutoCow autoCow;
    private NIVELES nivel;
   
    private String nombre;
    private int filetes;
    private int bebidas;
    private int n_empleados;
    private double dinero;
    private Mesas []mesas;
    //private int n_mesas;
    private int mesas_max;
   
   
    public McCow (){
        this.nombre = "McCow";
        this.filetes = 0;
        this.bebidas = 0;
        this.n_empleados = 1;
        this.dinero = 25.0;
       
        this.nivel = NIVEL_INICIAL;
       
        switch(nivel){
            case NIVELES.INICIAL:
                this.mesas_max=10;
                break;
            case NIVELES.INTERMEDIO:
                this.mesas_max=15;
                break;
            case NIVELES.DIFICIL:
                this.mesas_max=20;
                break;
            default:
                System.out.println("Error en la eleccion del nivel");
                break;
        }
        this.mesas = new Mesas[mesas_max];
       
        this.vestibulos = new Vestibulos( this.mesas, new Bebidas() ,new Empleados() );
        this.campoVacas = new CampoVacas();
        this.autoCow = new AutoCow();
    }
   
   // getters / setters
    public String getNombre(){
        return this.nombre;
    }
    public  int getFiletes(){
        return this.filetes;
    }
    public  int getBebidas(){
        return this.bebidas;
    }
    public  int getN_empleados(){
        return this.n_empleados;
    }
    public  double getDinero(){
        return this.dinero;
    }
    public int getN_mesas(){
        return this.vestibulos.getNV_Mesas();
    }
    public int getMax_mesas(){
        return this.mesas_max;
    }
    public NIVELES getNivel(){
        return this.nivel;
    }
    public void informacion(){
        System.out.println(
            this.nombre+" --> \n"+
            "| Filetes: "+this.filetes+"\n"+
            "| Empleados: "+this.n_empleados+"\n"+
            "| Bebidas: "+this.bebidas+"\n"+
            "| Dinero: "+this.dinero+"\n"+
            "| Max Mesas: "+this.mesas_max+"\n"+
            "| N Mesas: "+this.getN_mesas()+"\n"+
            "| Nivel: "+this.nivel
         );
    }
   
   
   // Metodos de la clase
    public void comprarMesa(){
        //Añadir un addMesa en Vestibulo
        this.vestibulos.addMesa();
        this.dinero -= 5;
    }
    public void venderMesa(){

    }

    public void comprarVacas(){

    }
    public void venderVacas(){

    }

    public void comprarEmpleados(){

    }
    public void venderEmpleados(){

    }

    public void comprarBebidas(){

    }
    public void venderBebidas(){

    }
   
   
   // MAIN - TEST
    public static void main(String[] args) {
        McCow mcCow = new McCow();
        
        // TEST DE FUNCIONES: 
        mcCow.informacion();
        
        mcCow.comprarMesa();
          
        mcCow.informacion();

    }
    
}

/**
 * 
 * @author enrique
 * 
 * Creacion del Vestibulo
 */
class Vestibulos{
    public static final String ICONO = " ";
    public static final int EXPERIENCIA = 0;
    private String icono;
    private int experiencia;
    
    protected Mesas []mesas;
    protected int n_mesas;
    protected Bebidas bebidas;
    protected Empleados empleados;
    
    public Vestibulos(Mesas []mesas,Bebidas bebidas,Empleados empleados){
        this.icono = ICONO;
        this.experiencia = EXPERIENCIA;
        
        this.mesas = mesas;
        this.bebidas = bebidas;
        this.empleados = empleados;
        this.n_mesas = 0;
    }
    
    public String getIcono(){
        return this.icono;
    }
    public int getExperiencia(){
        return this.experiencia;
    }
    public int getNV_Mesas(){
        return this.n_mesas;
    }
    public void setNV_Mesas(int numero_mesas){
        this.n_mesas = numero_mesas;
    }
    
    public void addMesa(){
        if(this.n_mesas < this.mesas.length){
            mesas[this.n_mesas] = new Mesas();
            //mesas[this.n_mesas].addMenu(); // Podriamos menerle el menu a la mesa
            this.n_mesas++;
        }else{
            System.out.println("Numero maximo alcanxzado en este nivel :) ");
        }
    }
}
class Mesas{
    
    public static final String ICONO = " ";
    public static final int DURACION = 2;
    public static final int EXPERIENCIA_BASICA = 1;
    public static final int PRECION_VENTA = 2;
    
    private String icono;
    private int duracionMesa;
    private int experienciaRecolectada;
    private int precioVenta;
    
    public Mesas(){
        this.icono = ICONO;
        this.duracionMesa = DURACION;
        this.experienciaRecolectada = EXPERIENCIA_BASICA;
        this.precioVenta = PRECION_VENTA;
    }
    public Mesas(String icono, int duracionMesa, int experienciaRecolectada, int precioVenta){
        this.icono = icono;
        this.duracionMesa = duracionMesa;
        this.experienciaRecolectada = experienciaRecolectada;
        this.precioVenta = precioVenta;
    }
    
    // getters / setters
    public String getIcono(){
        return this.icono;
    }
    public int getDuracion(){
        return this.duracionMesa;
    }
    public int getEXP(){
        return this.experienciaRecolectada;
    }
    public int getPrecioVenta(){
        return this.precioVenta;
    }
    
    
    
    
    
    public void addMenu(){
        
    }

}
// icono, precio de venta, suficientes para hacer la clase
class Bebidas{
    public static final String ICONO = " ";
    public static final int PRECION_VENTA = 2;
    
    private String icono;
    private int precioVenta;
    
    public Bebidas(){
        this.icono = ICONO;
        this.precioVenta = PRECION_VENTA;
    }
    public Bebidas(String icono, int precioVenta){
        this.icono = icono;
        this.precioVenta = precioVenta;
    }
    
    // getters / setters
    public String getIcono(){
        return this.icono;
    }
    public int getPrecioVenta(){
        return this.precioVenta;
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
    
    public String getIcono(){
        return this.icono;
    }
    public int getPrecioVenta(){
        return this.precioVenta;
    }
}

/**
 * Debemos hacer una clase Hamburguesa que debera tener lo mismo que bebida
 * y un metodo crear hamburguesa que reste filetes
 */
class Hamburguesa{}


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
