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
public class DispositivoInactivoException extends RuntimeException {

    public DispositivoInactivoException() {
        super("Este dispositivo no se encuentra activado");
    }
}
