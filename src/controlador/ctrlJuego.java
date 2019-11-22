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
public class ctrlJuego {

    int id_juego;
    int id_campeonato;
    int ELocal;
    int visitante;
    int id_cancha;
    String HoraInicio;
    String HoraFinalizacion;
    int golLocal;
    int golVisitante;

    //para que podas usar las funciones en el main hay que hacerlas estaticas
    public  void insertarJuego(int id_juego, int id_campeonato, int ELocal, int visitante, int id_cancha, String horaInicio, String horaFinalizacion, int golLocal, int golVisitante) {
        String query = "INSERT INTO juego VALUES(" + id_juego + "," + id_campeonato + "," + ELocal + "," + visitante + "," + id_cancha + ",'" + horaInicio + "','" + horaFinalizacion + "'," + golLocal + "," + golVisitante + ");";
        int resultado;
        conexion con = new conexion();
        resultado = con.setQuery(query);
    }

    public  String[][] getJuego() {
        String query = "SELECT * FROM juego";
        conexion con = new conexion();
        String[][] result = con.getQuery(query);
        return result;
    }
}
