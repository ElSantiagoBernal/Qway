/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import bridge.NotificadorPedido;
import modelo.Contenedor;

/**
 *
 * @author Santiago
 */
public class ControladorDispositivo {

    private int numeroNotificadores;
    private NotificadorPedido[][] notificadorPedido;

    public ControladorDispositivo() {
        notificadorPedido = new NotificadorPedido[4][4];
        initNotificadores();
        numeroNotificadores = 1;
    }

    private void initNotificadores() {
        for (int i = 0; i < notificadorPedido.length; i++) {
            for (int j = 0; j < notificadorPedido[i].length; j++) {
                notificadorPedido[i][j] = new NotificadorPedido(numeroNotificadores);
                numeroNotificadores += 1;
            }
        }
    }

    public NotificadorPedido obtenerNotificador(int fila, int columna) {
        return notificadorPedido[fila][columna];
    }

    public int obtenerFilas() {
        return notificadorPedido.length;
    }

    public int obtenerColumnas() {
        return notificadorPedido[0].length;
    }

}
