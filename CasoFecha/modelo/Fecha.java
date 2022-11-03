package modelo;

import java.util.ArrayList;

import javafx.scene.media.EqualizerBand;

public class Fecha{
    /// ------------------
    /// Atributos --------
    /// ------------------
    private int dia;
    private int mes;
    private int year;

    /// ------------------
    /// Métodos ----------
    /// ------------------

    /// -----------------------------------
    /// Métodos de acceso (setter y getter)
    /// -----------------------------------
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }
    
    /// --------------------------------------
    /// Método sobreescrito de la clase Object
    /// --------------------------------------
    public String toString(){
        return dia + "/" + mes + "/" + year;
    }

    /// --------------------------------------
    /// Método sobreescrito de la clase Object
    /// --------------------------------------
    
    public boolean equals(Object o){
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (year==otra.year);
    }
}