/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bridge.NotificadorPedido;

/**
 *
 * @author Santiago
 */
public class Contenedor {

    public static final String ACTIVO = "Activo";
    public static final String INACTIVO = "Inactivo";
    private int codigo;
    private int codigoPedido;

    private String estado;

    public Contenedor(int codigo) {
        estado = INACTIVO;
        this.codigo = codigo;
        this.codigoPedido = 0;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }
    
    
}
