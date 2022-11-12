package ejecutable;

import modelo.Fecha;

public class Test {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setDia(23);
        f.setMes(12);
        f.setYear(1980);
        f.addDias(180);

    System.out.println("Día: " + f.getDia());
    System.out.println("Mes: " + f.getMes());
    System.out.println("Year: " + f.getYear());
    System.out.println(f.toString());

    Fecha f2 = new Fecha();
        f2.setDia(2);
        f2.setMes(11);
        f2.setYear(1980);

    System.out.println("Día: " + f2.getDia());
    System.out.println("Mes: " + f2.getMes());
    System.out.println("Year: " + f2.getYear());
    System.out.println(f2.toString());

    if(f.equals(f2)){
    System.out.println("Las fechas son iguales");
    }
    else{
        System.out.println("Las fechas son diferentes");
    }
    }
}
