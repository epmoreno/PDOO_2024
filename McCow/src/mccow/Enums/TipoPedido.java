/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mccow.Enums;

/**
 *
 * @author enrique
 */
public enum TipoPedido {
    MENU("Menu"),
    SIMPLE("Simple");
    
    private final String valor;
            
    TipoPedido(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}


