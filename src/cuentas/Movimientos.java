package cuentas;

import java.time.LocalDate;

public class Movimientos {

    //ATRIBUTOS
    //contendra atirbutos del tipo "movimiento" abono o cargo mas la fecha que se realizo el movimiento
    private String tipoMovimiento;
    private int monto;
    private LocalDate fechaMovimiento;

    //CONSTRUCTORES
    public Movimientos(String tipoMovimiento, int monto, LocalDate fechaMovimiento){
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.fechaMovimiento = fechaMovimiento;
    }

    public Movimientos(String tipoMovimiento, int monto) {
        this(tipoMovimiento, monto, LocalDate.now());
    }

    //GETTERS Y SETTERS
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public LocalDate getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    //SOBRECARGA TO STRING
    @Override
    public String toString() {
        return "Movimiento = " + tipoMovimiento +
                ", Monto: $" + monto +
                ", Fecha: " + fechaMovimiento;
    }
}
