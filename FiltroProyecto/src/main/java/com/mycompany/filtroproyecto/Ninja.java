package com.mycompany.filtroproyecto;

import java.util.HashSet;
import java.util.Set;

public class Ninja {

    private int ninjaId;
    private String nombre;
    private String rango;
    private String aldea;
    Set<Integer> ids = new HashSet<>();

    public Ninja(int ninjaId, String nombre, String rango, String aldea) {
        if (!ids.contains(ninjaId)) {
            //Ids ya agregados desde la inserción de los archivos SQL
            ids.add(1);
            ids.add(2);
            ids.add(3);
            ids.add(4);
            //Verificación de IDS
            ids.add(ninjaId);
            this.ninjaId = ninjaId;
            this.nombre = nombre;
            this.rango = rango;
            this.aldea = aldea;
        } else {
            System.out.println("ID ya registrado");
        }

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
