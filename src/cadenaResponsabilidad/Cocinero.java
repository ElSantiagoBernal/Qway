/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaResponsabilidad;

import conexion.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pedido;

/**
 *
 * @author Santiago
 */
public class Cocinero extends Empleado {

    Conexion conexion = new Conexion();

    public Cocinero(String cargo, String codEmpleado, String nombre, String apellido, String identificacion, String telefono) {
        super(cargo, codEmpleado, nombre, apellido, identificacion, telefono);
    }

    @Override
    public void evaluarOcurrencia(String ocurrencia, int id, Double precio, String cedulaCliente, Pedido pedido, String tipoCliente) {
        if (ocurrencia.equals("Cocinar Sandwich")) {
            System.out.println("Cocinando ando...");
            prepararIngredientes(id);
            prepararSandwich();
        }
    }

    public void prepararIngredientes(int id) {
        List<Boolean> temp = buscarSandwich(id);
        String mensaje = "Sandwich con Base de:\n";
        if (temp.get(0)) {
            mensaje += " - pan integral\n";
        }
        if (temp.get(1)) {
            mensaje += " - pan griego\n";
        }
        if (temp.get(2)) {
            mensaje += " - pan normal\n";
        }
        mensaje += "Ingredientes: \n";
        if (temp.get(3)) {
            mensaje += " - carne\n";
        }
        if (temp.get(4)) {
            mensaje += " - bbq\n";
        }
        if (temp.get(5)) {
            mensaje += " - cebolla\n";
        }
        if (temp.get(6)) {
            mensaje += " - jamon\n";
        }
        if (temp.get(7)) {
            mensaje += " - mayonesa\n";
        }
        if (temp.get(8)) {
            mensaje += " - pepinillos\n";
        }
        if (temp.get(9)) {
            mensaje += " - pollo\n";
        }
        if (temp.get(10)) {
            mensaje += " - queso\n";
        }
        if (temp.get(11)) {
            mensaje += " - salchicha\n";
        }
        if (temp.get(12)) {
            mensaje += " - tomate\n";
        }
        if (temp.get(13)) {
            mensaje += " - lechuga\n";
        }
        if (temp.get(14)) {
            mensaje += " - rosada\n";
        }
        if (temp.get(15)) {
            mensaje += " - mostaza\n";
        }
        System.out.println(mensaje);
    }

    public void prepararSandwich() {
        System.out.println(" ");
        System.out.println("             ████████████████████            ");
        System.out.println("         ██▒▒▒▒██  ▒▒▒▒▒▒▒▒██  ▒▒▒▒██  ");
        System.out.println("     ██▒▒▒▒▒▒████▒▒▒▒▒▒▒▒████▒▒▒▒▒▒██    ");
        System.out.println("     ██▒▒▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒██    ");
        System.out.println("     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ");
        System.out.println("  ████████████████████████████████████  ");
        System.out.println("  ██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██  ");
        System.out.println("     ████████████████████████████████    ");
        System.out.println("     ██░░██░░░░██████░░░░░░██░░░░████    ");
        System.out.println("     ████▒▒████▒▒▒▒▒▒██████▒▒████▒▒██    ");
        System.out.println("     ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ");
        System.out.println("        ████████████████████████████    ");
        System.out.println(" ");

    }

    public List<Boolean> buscarSandwich(int id) {

        List<Boolean> temp = new ArrayList<Boolean>();

        conexion.conectar();

        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select * from sandwich where "
                            + "idSandwich=" + id + ""));//consulta        

            if (conexion.getResultadoDB().next()) {
                temp.add(conexion.getResultadoDB().getBoolean("panIntegral"));
                temp.add(conexion.getResultadoDB().getBoolean("panGriego"));
                temp.add(conexion.getResultadoDB().getBoolean("panNormal"));
                temp.add(conexion.getResultadoDB().getBoolean("carne"));
                temp.add(conexion.getResultadoDB().getBoolean("bbq"));
                temp.add(conexion.getResultadoDB().getBoolean("cebolla"));
                temp.add(conexion.getResultadoDB().getBoolean("jamon"));
                temp.add(conexion.getResultadoDB().getBoolean("mayonesa"));
                temp.add(conexion.getResultadoDB().getBoolean("pepinillos"));
                temp.add(conexion.getResultadoDB().getBoolean("pollo"));
                temp.add(conexion.getResultadoDB().getBoolean("queso"));
                temp.add(conexion.getResultadoDB().getBoolean("salchicha"));
                temp.add(conexion.getResultadoDB().getBoolean("tomate"));
                temp.add(conexion.getResultadoDB().getBoolean("lechuga"));
                temp.add(conexion.getResultadoDB().getBoolean("rosada"));
                temp.add(conexion.getResultadoDB().getBoolean("mostaza"));

            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Cocinero.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }

}
