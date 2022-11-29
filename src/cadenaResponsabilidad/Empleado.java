/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaResponsabilidad;

import modelo.Pedido;
import modelo.Persona;

/**
 *
 * @author Santiago
 */
public abstract class Empleado extends Persona {
    
    protected Empleado nextHandler;
    public String ocurrencia;
    private String cargo;
    private String codEmpleado;

    public Empleado(String cargo, String codEmpleado, String nombre, String apellido, String identificacion, String telefono) {
        super(nombre, apellido, identificacion, telefono);
        this.cargo = cargo;
        this.codEmpleado = codEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    
    //Methods
    public Empleado getNextHandler() {
        return nextHandler;
    }
    
    public void setNextHandler(Empleado nextHandler){
        this.nextHandler = nextHandler;
    }
    
    public abstract void evaluarOcurrencia(String ocurrencia, int id, Double precio, String cedulaCliente, Pedido pedido, String tipoCliente);

    
}
