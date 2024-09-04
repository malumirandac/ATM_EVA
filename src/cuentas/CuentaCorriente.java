package cuentas;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente {
        //ATRIBUTOS
        private String titular;
        private int numero;
        private int saldo;
        private List<Movimientos> movimientos; // array para almacenar movimientos

        //CONSTRUCTORES
        //constructor con titular y numero obligatorio
        public CuentaCorriente(String titular, int numero){
            this.titular = titular;
            this.numero = numero;
            this.saldo = 0;
            this.movimientos = new ArrayList<>();
        }
        //constructor con todos los atributos
        public CuentaCorriente(String titular, int numero, int saldo){
            this.titular = titular;
            this.numero = numero;
            this.saldo = saldo;
            this.movimientos = new ArrayList<>();
        }

        //GETTERS Y SETTERS
        public String getTitular(){
            return titular;
        }

        public void setTitular(String titular){
            this.titular = titular;
        }

        public int getNumero(){
            return numero;
        }

        public void setNumero(int numero){
            this.numero = numero;
        }

        public int getSaldo(){
            return saldo;
        }

        //cambiamos a private para que solo se pueda modificar mediante abonar y cargar
        private void setSaldo(int saldo){
            this.saldo = saldo;
        }

        //METODOS
        //Metodo para abonar
        public void abonar(int monto){
            if (monto >= 0){
                this.saldo += monto;
                agregarMovimiento(new Movimientos("Abono", monto));
                //se agrega el movimiento a la lista
            } else{
                System.out.println("***EL MONTO A ABONAR NO PUEDE SER NEGATIVO***");
            }
        }

        //Metodo para cargar
        public void cargar(int monto){
            if (monto > 0){
                this.saldo -= monto;
                if (this.saldo < 0) {
                    this.saldo = 0;
                }
                agregarMovimiento(new Movimientos("Cargo", monto));
                //se agrega el movimiento a la lista
            }else{
                System.out.println("***EL MONTO A CARGAR NO PUEDE SER NEGATIVO***");
            }
        }

        //Metodo para agregar movimientos con condicional ultimos 10
        private void agregarMovimiento(Movimientos movimiento){
            if (movimientos.size() == 10){
                movimientos.remove(0);
            }
            movimientos.add(movimiento);
        }

        //Metodo para mostrar movimientos
        public List<Movimientos> getMovimientos(){
            return movimientos;
        }


        //SOBRECARGA TO STRING
        @Override
        public String toString(){
            return "LOS DATOS DE LA CUENTA SON: " +
                    "\nTITULAR = " + titular  +
                    "\nNUMERO = " + numero +
                    "\nSALDO = $" + saldo +
                    '\n';
        }


}