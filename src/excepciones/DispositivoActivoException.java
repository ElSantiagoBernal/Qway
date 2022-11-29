/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author andre
 */
public class DispositivoActivoException extends RuntimeException {

    public DispositivoActivoException() {
        super("Este dispositivo ya se encuentra activo, seleccione otro");
    }
}
