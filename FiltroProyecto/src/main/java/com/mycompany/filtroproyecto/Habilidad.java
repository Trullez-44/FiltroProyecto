
package com.mycompany.filtroproyecto;

public class Habilidad {
    
    private int ninjaId;
    private String name;
    private String descripcion;

    public Habilidad(int ninjaId, String name, String descripcion) {
        this.ninjaId = ninjaId;
        this.name = name;
        this.descripcion = descripcion;
    }

    public int getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(int ninjaId) {
        this.ninjaId = ninjaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "ninjaId=" + ninjaId + ", name=" + name + ", descripcion=" + descripcion + '}';
    }
    
}
