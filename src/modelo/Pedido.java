/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bridge.Sandwich;

/**
 *
 * @author Santiago
 */
public class Pedido {
    
    private int codigoNotificador;
    private Sandwich sandwich;

    public Pedido(int codigoNotificador, Sandwich sandwich) {
        this.codigoNotificador = codigoNotificador;
        this.sandwich = sandwich;
    }

    public int getCodigoNotificador() {
        return codigoNotificador;
    }

    public void setCodigoNotificador(int codigoNotificador) {
        this.codigoNotificador = codigoNotificador;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
    
}
