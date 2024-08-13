package cuentas;

//hola profe, aquí mi codigo :)
//utilicé el metodo main dentro de la misma clase, no a parte para tener el codigo en un mismo lugar

public class CuentaCorriente {
        //atributos
        private String titular;
        private int numero;
        private int saldo;

        //constructores
        //constructor con titular y numero obligatorio
        public CuentaCorriente(String titular, int numero){
            this.titular = titular;
            this.numero = numero;
            this.saldo = 0;
        }
        //constructor con todos los atributos
        public CuentaCorriente(String titular, int numero, int saldo){
            this.titular = titular;
            this.numero = numero;
            this.saldo = saldo;
        }

        //Getters y setters
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

        public void setSaldo(int saldo){
            this.saldo = saldo;
        }

        //Metodo para abonar
        public void abonar(int monto){
            if (monto >= 0){
                this.saldo += monto;
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
            }else{
                System.out.println("***EL MONTO A ABONAR NO PUEDE SER NEGATIVO***");
            }
        }

        //Sobrecarga metodo toString
        @Override
        public String toString(){
            return "LOS DATOS DE LA CUENTA SON: " +
                    "\nTITULAR = " + titular  +
                    "\nNUMERO = " + numero +
                    "\nSALDO = $" + saldo +
                    '\n';
        }


}