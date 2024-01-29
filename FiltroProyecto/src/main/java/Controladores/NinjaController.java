package Controladores;

import ConexionDB.BDConnection;
import ConexionDB.Operaciones;
import com.mycompany.filtroproyecto.MostrarNinjas;
import com.mycompany.filtroproyecto.Ninja;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class NinjaController {

    public static boolean sendNinja(Ninja ninja) throws SQLException {
        Operaciones.setConnection(BDConnection.MySQLConnection());
        String query = "INSERT INTO ninja (Nombre, Rango, Aldea) VALUES(?,?,?)";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(query);
        ps.setString(1, ninja.getNombre());
        ps.setString(2, ninja.getRango());
        ps.setString(3, ninja.getAldea());
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

    public static List<Ninja> getAllNinjas() throws SQLException {

        Operaciones.setConnection(BDConnection.MySQLConnection());
        String query = "SELECT * FROM ninja";
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
        MostrarNinjas ninjas = () -> {
            List<Ninja> NINJAS = new ArrayList<>();
            try {
                while (rs.next()) {
                    int ninjaId = rs.getInt("ID");
                    String nombre = rs.getString("Nombre");
                    String rango = rs.getString("Rango");
                    String aldea = rs.getString("Aldea");
                    Ninja currenctNinja = new Ninja(ninjaId, nombre, rango, aldea);
//                System.out.println(currenctNinja.toString());
                    NINJAS.add(currenctNinja);

                }
            } catch (SQLException ex) {
                Logger.getLogger(NinjaController.class.getName()).log(Level.SEVERE, null, ex);
                return NINJAS;
            }
            return NINJAS;
        };
        return ninjas.ListarNinjas();
    }
}
