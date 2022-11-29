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
public class BaseNoSeleccionadaException extends RuntimeException {

    public BaseNoSeleccionadaException() {
        super("Se debe seleccionar al menos una base de pan");
    }
}
