
package com.mycompany.filtroproyecto;

import java.util.List;

public interface MostrarMisiones {
    public Mision getMisionByNinjaId(Ninja ninjaId);
    //Revisar si mostrar los resultados en el retorno del metodo o en el metodo en sí.
    public List<Mision> getAllCompletedMisionsByNinjaId(Ninja ninjaId);
    public void getAllCompletedMisions();
    //
}
