package cuentas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimientos {

    //ATRIBUTOS
    //contendra atirbutos del tipo "movimiento" abono o cargo mas la fecha y hora que se realizo el movimiento
    private String tipoMovimiento;
    private int monto;
    private LocalDateTime fechaHoraMovimiento;

    //CONSTRUCTORES
    public Movimientos(String tipoMovimiento, int monto, LocalDateTime fechaHoraMovimiento){
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.fechaHoraMovimiento = fechaHoraMovimiento;
    }

    public Movimientos(String tipoMovimiento, int monto) {
        this(tipoMovimiento, monto, LocalDateTime.now());
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

    public LocalDateTime getFechaHoraMovimiento() {
        return fechaHoraMovimiento;
    }

    public void setFechaHoraMovimiento(LocalDateTime fechaHoraMovimiento) {
        this.fechaHoraMovimiento = fechaHoraMovimiento;
    }

    //SOBRECARGA TO STRING
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Movimiento = " + tipoMovimiento +
                ", Monto: $" + monto +
                ", Fecha y Hora: " + fechaHoraMovimiento.format(formatter);
    }
}