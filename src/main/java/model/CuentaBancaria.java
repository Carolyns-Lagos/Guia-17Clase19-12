package model;

public class CuentaBancaria {

    private String idCuenta,tipoCuenta;
    private int saldoDisponible;

    public CuentaBancaria(){
        this.idCuenta="";
        this.saldoDisponible=0;
        this.tipoCuenta="";

    }

    public CuentaBancaria(String idCuenta, String tipoCuenta, int saldoDisponible) {
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
