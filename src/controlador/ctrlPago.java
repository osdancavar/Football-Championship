/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import servicios.*;

/**
 *
 * @author josel
 */
public class ctrlPago {

    int id_pago;
    int id_campeonato;
    int id_equipo;
    String monto;
    String descripcionPago;

    //para que podas usar las funciones en el main hay que hacerlas estaticas
    public  void insertarPago(int id_pago, int id_campeonato, int id_equipo, double monto, String descripcionPago) {
        String query = "INSERT INTO pago VALUES(" + id_pago + "," + id_campeonato + ",'" + id_equipo + "', '" + monto + "','" + descripcionPago + "');";
        int resultado;
        conexion con = new conexion();
        resultado = con.setQuery(query);
    }

    public  String[][] getPago() {
        String query = "SELECT * FROM pago";
        conexion con = new conexion();
        String[][] result = con.getQuery(query);
        return result;
    }
}
