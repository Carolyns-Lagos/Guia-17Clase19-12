package model;

import exepciones.SinConexionException;

import javax.swing.plaf.nimbus.State;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class CuentaBancariaDAO {
    //Tendra metodos y modificaa la base
    //Nunca sera estatica

    private Conexion conexion;
    private Statement statement;
    private PreparedStatement psInsert;


    public void insertarCuenta(CuentaBancaria o) throws SinConexionException {
        try{
            psInsert= conexion.getConexion().prepareStatement("");
        }catch (SQLException ex){
            System.out.println("Error"+ex);
            //Mostramos solo el error
        }


    }
}
