package com.mycompany.filtroproyecto;

public class Mision {

    private int misionId;
    private String descripcion;
    private String rango;
    private String recompensa;

    public Mision(int misionId, String descripcion, String rango, String recompensa) {
        this.misionId = misionId;
        this.descripcion = descripcion;
        this.rango = rango;
        this.recompensa = recompensa;
    }

    public int getMisionId() {
        return misionId;
    }

    public void setMisionId(int misionId) {
        this.misionId = misionId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        return "Mision{" + "misionId=" + misionId + ", descripcion=" + descripcion + ", rango=" + rango + ", recompensa=" + recompensa + '}';
    }
    
}
