package model;

public class Banco {

    private String idCuenta,tipoCuenta;
    private int saldoDisponible;

    public Banco(){
        this.idCuenta="";
        this.saldoDisponible=0;
        this.tipoCuenta="";

    }

    public Banco(String idCuenta, String tipoCuenta, int saldoDisponible) {
        this.idCuenta = idCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoDisponible = saldoDisponible;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
