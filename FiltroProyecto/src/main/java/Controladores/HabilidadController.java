
package Controladores;

import ConexionDB.BDConnection;
import ConexionDB.Operaciones;
import com.mycompany.filtroproyecto.Habilidad;
import com.mycompany.filtroproyecto.MostrarHabilidades;
import com.mycompany.filtroproyecto.MostrarNinjas;
import com.mycompany.filtroproyecto.Ninja;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class HabilidadController {
    
        public static boolean sendHabilidad(Habilidad habilidad) throws SQLException {
        Operaciones.setConnection(BDConnection.MySQLConnection());
        String query = "INSERT INTO habilidad (ID_Ninja, Nombre, Descripcion) VALUES(?,?,?)";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(query);
        ps.setInt(1, habilidad.getNinjaId());
        ps.setString(2, habilidad.getNombre());
        ps.setString(3, habilidad.getDescripcion());
        if (Operaciones.setAutoCommitBD(false)) {
            if (Operaciones.insert_update_delete_db(ps) > 0) {
                Operaciones.commitBD();
                Operaciones.closeConnection();
                return true;
            } else {
                Operaciones.rollbackBD();
                Operaciones.closeConnection();
                return false;
            }

        } else {
            Operaciones.closeConnection();
            return false;
        }
    }
        public static List<Habilidad> getAllHabilidad() throws SQLException {

        Operaciones.setConnection(BDConnection.MySQLConnection());
        String query = "SELECT * FROM Habilidad";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(query);
        ResultSet rs = Operaciones.query_db(ps);
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
        //LAMBDA EXPRESSION IS COMING
            MostrarHabilidades habilidades = () -> {
            List<Habilidad> Habilidades = new ArrayList<>();
            try {
                while (rs.next()) {
                    int ninjaId = rs.getInt("ID_Ninja");
                    String nombre = rs.getString("Nombre");
                    String descripcion = rs.getString("Descripcion");
                    Habilidad currenctHabilidad = new Habilidad(ninjaId, nombre, descripcion);
//                System.out.println(currenctNinja.toString());
                    Habilidades.add(currenctHabilidad);

                }
            } catch (SQLException ex) {
                Logger.getLogger(NinjaController.class.getName()).log(Level.SEVERE, null, ex);
                return Habilidades;
            }
            return Habilidades;
        };
        return habilidades.ListarHabilidades();
    }
}
