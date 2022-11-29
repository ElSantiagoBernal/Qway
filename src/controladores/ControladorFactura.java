/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import conexion.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santiago
 */
public class ControladorFactura {

    Conexion conexion = new Conexion();

    public DefaultTableModel listarFacturas() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"idFactura", "valor", "cedulaCliente", "idPedido"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select * from factura order by idFactura"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("idFactura"),
                    conexion.getResultadoDB().getString("precio"),
                    conexion.getResultadoDB().getString("cedulaCF"),
                    conexion.getResultadoDB().getInt("idPedidoF")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFactura.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temporal;
    }

    public int cantidadFacturas() {
        int cantidad = 0;
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select count(*) from factura order by idFactura"));//consulta        
            while (conexion.getResultadoDB().next()) {
                cantidad = conexion.getResultadoDB().getInt(1);
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFactura.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return cantidad;
    }

}
