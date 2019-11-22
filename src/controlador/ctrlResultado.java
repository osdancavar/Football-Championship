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
public class ctrlResultado {
    int id_resultado;
    int id_juego;
    int id_equipo;
    int gol;
    int puntos;
    String estado;
    //para que podas usar las funciones en el main hay que hacerlas estaticas
    public  void insertarResultado (int id_resultado, int id_juego, int id_equipo, int gol, String estado, int puntos) {
        String query ="INSERT INTO resultado VALUES("+ id_resultado+","+id_juego+",'"+id_equipo+"', '"+gol+"','"+estado+"','"+puntos+"');";
        int resultado;
          conexion con = new conexion();
        resultado = con.setQuery(query);
    }
    public  String[][] getResultado() {
        String query = "SELECT * FROM resultado";
        conexion con = new conexion();
        String [][] result=con.getQuery(query);
        return result;
    }
}
