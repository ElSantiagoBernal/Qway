/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaResponsabilidad;

import conexion.Conexion;
import factory.Factoria;
import factory.Factura;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Pedido;

/**
 *
 * @author Santiago
 */
public class Cajero extends Empleado {

    Conexion conexion = new Conexion();

    public Cajero(String cargo, String codEmpleado, String nombre, String apellido, String identificacion, String telefono) {
        super(cargo, codEmpleado, nombre, apellido, identificacion, telefono);
    }

    @Override
    public void evaluarOcurrencia(String ocurrencia, int id, Double precio, String cedulaCliente, Pedido pedido, String tipoCliente) {
        if (ocurrencia.equals("Generar Factura")) {
            generarFactura(id, precio, cedulaCliente, pedido, tipoCliente);
        } else {
            this.nextHandler.evaluarOcurrencia(ocurrencia, id, precio, cedulaCliente, pedido, tipoCliente);
        }
    }

    public boolean generarFactura(int id, Double precio, String cedulaCliente, Pedido pedido, String tipoCliente) {
        conexion.conectar();
        Factura fact = Factoria.createFactura(tipoCliente);
        fact.setCedulaCliente(cedulaCliente);
        fact.setImporte(precio);
        fact.setPedido(pedido);
        fact.setId(id);
        try {
            conexion.getSentenciaSQL().execute("insert into sandwich(idSandwich, panIntegral, panGriego, panNormal, "
                    + "carne, bbq, cebolla, jamon, mayonesa, pepinillos, pollo, queso, salchicha, tomate, lechuga, rosada, mostaza) "
                    + "values(" + id + ","
                    + pedido.getSandwich().isPanIntegral() + ","
                    + pedido.getSandwich().isPanGriego() + ","
                    + pedido.getSandwich().isPanNormal() + ","
                    + pedido.getSandwich().isCarne() + ","
                    + pedido.getSandwich().isBBQ() + ","
                    + pedido.getSandwich().isCebolla() + ","
                    + pedido.getSandwich().isJamon() + ","
                    + pedido.getSandwich().isMayonesa() + ","
                    + pedido.getSandwich().isPepinillos() + ","
                    + pedido.getSandwich().isPollo() + ","
                    + pedido.getSandwich().isQueso() + ","
                    + pedido.getSandwich().isSalchicha() + ","
                    + pedido.getSandwich().isTomate() + ","
                    + pedido.getSandwich().isLechuga() + ","
                    + pedido.getSandwich().isRosada() + ","
                    + pedido.getSandwich().isMostaza() + ")");//consulta
            
            conexion.getSentenciaSQL().execute("insert into pedido(idPedido, codigoNotificador, idSandwichP) "
                    + "values(" + id + ","
                    + pedido.getCodigoNotificador() + ","
                    + id + ")");//consulta
            
            conexion.getSentenciaSQL().execute("insert into factura(idFactura, precio, cedulaCF, idPedidoF) "
                    + "values(" + id + ","
                    + precio + ",'"
                    + cedulaCliente + "',"
                    + id + ")");//consulta
            
            conexion.desconectar();//se desconecta de la base de datos    
            JOptionPane.showMessageDialog(null, "Factura registrada!");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            conexion.desconectar();//se desconecta de la base de datos    
            return false;            
        }
    }
    
}
