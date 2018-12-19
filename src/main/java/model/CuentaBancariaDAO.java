package model;

import exepciones.SinConexionException;

import javax.swing.plaf.nimbus.State;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            psInsert= conexion.getConexion().
                    prepareStatement("INSERT INTO cuentabancaria(idCuenta,SaldoDisponible,TipoCuenta)"+"Vaue(?,?,?)");
            psInsert.setString(1,o.getIdCuenta());
            psInsert.setInt(2,o.getSaldoDisponible());
            psInsert.setString(3,o.getTipoCuenta());
            psInsert.executeUpdate(); //Es cualquier cambio que agregue o modifique algo, con esto de ejecuta
        }catch (SQLException ex){
            System.out.println("Error"+ex);
            //Mostramos solo el error
        }
    }

    public void obtenerCuenta(){
        try{
            psInsert=conexion.getConexion().prepareStatement("SELECT * FROM cuentabanco");
            ResultSet rs=psInsert.executeQuery();//Este quiery siempre se guarda en el result set

            while (rs.next()){
                System.out.println(rs.getString("idCuenta")+ " | ");
                System.out.println(rs.getString("SaldoDisponible")+ " | ");
                System.out.println(rs.getString("TopoCuenta")+ " | ");
            }

        }catch (SQLException e) {
            System.out.println("Error" + e);
        }

    }

}
