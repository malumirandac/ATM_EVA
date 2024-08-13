package cuentas;

public class Main {
    public static void main(String[] args) {

        //cuenta con saldo por defecto
        CuentaCorriente cuenta001 = new CuentaCorriente("Fede Rico", 987654);
        System.out.println(cuenta001);

        //cuenta con saldo predeterminado
        CuentaCorriente cuenta002 = new CuentaCorriente("Maca Rena", 321654, 10000);
        System.out.println(cuenta002);

        //abonar a cuenta001
        cuenta001.abonar(500000);
        System.out.println("TRAS ABONAR $500000: " + cuenta001);

        //abonar negativo
        cuenta001.abonar(-10000);
        System.out.println("TRAS ABONAR $-10000: " + cuenta001);

        //cargar saldo a cuenta002
        cuenta002.cargar(200);
        System.out.println("TRAS CARGAR $200: " + cuenta002);

        //cargar saldo negativo
        cuenta002.cargar(-20);
        System.out.println("TRAS CARGAR $-20: " + cuenta002);

        //cargar salgo que deje cuenta en negativo
        cuenta002.cargar(20000);
        System.out.println("TRAS CARGAR $20000 " + cuenta002);

        //uso del get
        System.out.println("La primera cuenta creada corresponde a " + cuenta001.getTitular()
                + " y la segunda a " + cuenta002.getTitular());
        System.out.println("\nLa cuenta número " + cuenta002.getNumero() + " corresposdiente a "
                + cuenta002.getTitular() + " tiene un saldo de: $" + cuenta002.getSaldo());

        //uso del set
        cuenta001.setTitular("Fede Raco");
        System.out.println("\nEl nuevo nombre del titular de la cuenta " + cuenta001.getNumero() + " es: "
                + cuenta001.getTitular());

    }
}
