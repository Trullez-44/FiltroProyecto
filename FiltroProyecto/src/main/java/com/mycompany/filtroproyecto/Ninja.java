
package com.mycompany.filtroproyecto;

public class Ninja {
    private int ninjaId;
    private String nombre;
    private String rango;
    private String aldea;

    public Ninja(int ninjaId, String nombre, String rango, String aldea) {
        this.ninjaId = ninjaId;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
    }

    public int getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(int ninjaId) {
        this.ninjaId = ninjaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    @Override
    public String toString() {
        return "Ninja{" + "ninjaId=" + ninjaId + ", nombre=" + nombre + ", rango=" + rango + ", aldea=" + aldea + '}';
    }
    
}