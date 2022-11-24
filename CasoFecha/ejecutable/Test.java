package ejecutable;

import modelo.Fecha;
import modelo.FechaDetallada;
import modelo.FechaHora;
import modelo.MuestraConjunto;

public class Test {
    public static void main(String[] args) {
    Fecha f = new Fecha(12, 10, 2004);

    System.out.println(f.toString());

    Fecha f2 = new Fecha(30,02,1996);

    System.out.println(f2.toString());

    if(f.equals(f2)){
    System.out.println("Las fechas son iguales");
    }
    else{
        System.out.println("Las fechas son diferentes");
    }

    FechaDetallada miFechaDetallada = new FechaDetallada(22,12,1940);
    miFechaDetallada.fechaCompleja(12);
    Object[] arr = {new Fecha(2,10,1970), miFechaDetallada.toString(), new String("Esto es una cadena"), new Integer(34)};
    
    MuestraConjunto.mostrar(arr);

    FechaHora f3 = new FechaHora("24/12/1990", 2, 55, 60);
    System.out.println(f3.toString());
}
}
