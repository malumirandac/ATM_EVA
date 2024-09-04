package cuentas;
//PARTICIPANTES:
//FRANCISCA MALU MIRANDA CORTES
//MATIAS IGNACIO MARQUES FERRADA
public class Main {
    public static void main(String[] args) {

        //creacion cuenta001 con saldo por defecto
        CuentaCorriente cuenta001 = new CuentaCorriente("Fede Rico", 123456);
        System.out.println(cuenta001);

        //movimientos a cuenta001
        //primer abono
        cuenta001.abonar(500000);
        System.out.println("TRAS ABONAR $500000 el monto actual es de: \n $" + cuenta001.getSaldo() + "\n");

        //abonar negativo que evidencie la validacion
        cuenta001.abonar(-10000);
        System.out.println("TRAS ABONAR $-10000 el monto actual es de: \n $" + cuenta001.getSaldo() + "\n");

        //cargar saldo negativo que evidencia la validacion
        cuenta001.cargar(-20);
        System.out.println("TRAS CARGAR $-10000 el monto actual es de: \n $" + cuenta001.getSaldo() + "\n");

        //cargar saldo negativo que evidencia la validacion
        cuenta001.cargar(1000);
        System.out.println("TRAS CARGAR $-10000 el monto actual es de: \n $" + cuenta001.getSaldo() + "\n");

        //mas movimientos en cuenta001
        cuenta001.cargar(1000);
        cuenta001.abonar(2000);
        cuenta001.cargar(5000);
        cuenta001.abonar(10000);
        cuenta001.cargar(200000);
        cuenta001.abonar(3000);
        cuenta001.cargar(20000);
        cuenta001.abonar(30000);
        cuenta001.cargar(200000);
        cuenta001.abonar(3000);

        //mostrar movimientos de cuenta001
        System.out.println("MOVIMIENTOS DE LA CUENTA NUMERO " + cuenta001.getNumero() + " PERTENECIENTE A " + cuenta001.getTitular() + " SON:");
        for (Movimientos mov : cuenta001.getMovimientos()){
            System.out.println(mov);
        }
        System.out.println("SALDO TOTAL: $" + cuenta001.getSaldo() + "\n");
        System.out.println("------------------------------------");


        //creacion cuenta002 con saldo predeterminado
        CuentaCorriente cuenta002 = new CuentaCorriente("Maca Rena", 123457, 10000);
        System.out.println(cuenta002);

        //cargar saldo a cuenta002
        cuenta002.cargar(200);
        System.out.println("TRAS CARGAR $200 el monto actual es de: \n $" + cuenta002.getSaldo() + "\n");

        //cargar salgo que deje cuenta en negativo
        cuenta002.cargar(20000);
        System.out.println("TRAS CARGAR $20000 el monto actual es de: \n $" + cuenta002.getSaldo() + "\n");

        cuenta002.abonar(20000);
        System.out.println("TRAS ABONAR $20000 el monto actual es de: \n $" + cuenta002.getSaldo() + "\n");

        //mas movimientos en cuenta002
        cuenta002.abonar(3000000);
        cuenta002.cargar(10000);
        cuenta002.abonar(2000);
        cuenta002.cargar(50000);
        cuenta002.abonar(10000);
        cuenta002.cargar(50000);
        cuenta002.abonar(3000);
        cuenta002.cargar(20000);
        cuenta002.abonar(30000);
        cuenta002.cargar(200);
        cuenta002.abonar(3000);

        //mostrar movimientos de cuenta002
        System.out.println("MOVIMIENTOS DE LA CUENTA NUMERO " + cuenta002.getNumero() + " PERTENECIENTE A " + cuenta002.getTitular() + " SON:");
        for (Movimientos mov : cuenta002.getMovimientos()){
            System.out.println(mov);
        }
        System.out.println("SALDO TOTAL: $" + cuenta002.getSaldo() + "\n");
        System.out.println("------------------------------------");


        //uso del set
        cuenta001.setTitular("Fede Raco");
        System.out.println("\nEl nuevo nombre del titular de la cuenta " + cuenta001.getNumero() + " es: "
                + cuenta001.getTitular() + "\n" + cuenta001);




    }
}
