/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import javax.swing.JOptionPane;
import modelo.Contenedor;

/**
 *
 * @author Santiago
 */
public class NotificadorPedido extends Contenedor implements Dispositivo{
    
    protected boolean activado;

    public NotificadorPedido(int codigo) {
        super(codigo);
        activado = false;
    }
    
    @Override
    public boolean isActivado() {
        return activado;
    }

    @Override
    public void activar() {
        if(activado){
            JOptionPane.showMessageDialog(null, "Ya esta activado");
            return;
        }
        activado = true;
        JOptionPane.showMessageDialog(null, "Se activo el notificador");
    }

    @Override
    public void desactivar() {
         if(activado == false){
            JOptionPane.showMessageDialog(null, "Ya esta desactivado");
            return;
        }
        activado = true;
        JOptionPane.showMessageDialog(null, "Se desactivo el notificador");
    }
    
    
    
}
