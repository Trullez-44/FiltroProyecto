package com.mycompany.filtroproyecto;

import java.util.HashSet;
import java.util.Set;

public class Habilidad {

    private int ninjaId;
    private String nombre;
    private String descripcion;
    Set<Integer> ids = new HashSet<>();

    public Habilidad(int ninjaId, String nombre, String descripcion) {
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
            this.descripcion = descripcion;
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

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "ninjaId=" + ninjaId + ", name=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
