/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mccow.Enums;

/**
 *
 * @author enrique
 */
public enum McCowEnum {
    INICIAL("INICIAL"),
    INTERMEDIO("INTERMEDIO"),
    FINAL("DIFICIL");
    
    private final String valor;

    McCowEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
}
