/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Santiago
 */
public class CampoVacioException extends RuntimeException {
    
    public CampoVacioException() {
        super("El campo está vació.");
    }
    
}
