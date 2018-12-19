package model;

public class Transaccion {
    private int idTransaccion;
    private String tipoCuenta;
    private CuentaBancaria idCuenta;

    public Transaccion(int idTransaccion, CuentaBancaria cuenta, String tipoCuenta) {
        this.idTransaccion = idTransaccion;
        this.idCuenta = cuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public Transaccion() {
        this.idTransaccion = 0;
        this.idCuenta = null;
        this.tipoCuenta = "";
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public CuentaBancaria getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(CuentaBancaria idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


}
