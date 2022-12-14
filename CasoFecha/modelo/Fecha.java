package modelo;

public class Fecha{
    /// ------------------
    /// Atributos --------
    /// ------------------
    protected int dia;
    protected int mes;
    protected int year;
    protected int i;
    protected String fecha;
    public Object sFecha;

    /// ------------------
    /// Métodos ----------
    /// ------------------

    /// -----------------------------------
    /// Métodos de acceso (setter y getter)
    /// -----------------------------------

    public Fecha(int d, int m, int y){
        this.dia = d;
        this.mes = m;
        this.year = y;
    }

    public Fecha(String sFecha2) {
    }

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
    
    private int fechaToDias()
    {
        return year * 360 + mes * 30 + dia;
    }

    public void addDias(int d)
    {
        int sum = fechaToDias()+d;
        diasToFecha(sum);
    }

    private void diasToFecha(int i)
    {
        year =(int)(i/360);
        mes = (int)(i%360/30);
        dia = (int)(i%30);
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