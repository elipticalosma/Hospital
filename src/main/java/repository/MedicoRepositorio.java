package repository;
import configurations.ConfigH2;
import repository.entities.Medicos;
import repository.entities.Pacientes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MedicoRepositorio {

    // MISMO QUE USER REPOSITORI
    // acede base de datos y guardar



    public Medicos getByUserId(int idUsuario) {
        String query = "SELECT * FROM medicos WHERE  idUsuario = ?";

        try {
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

            statement.setInt(1, idUsuario);
            ResultSet resultSet = statement.executeQuery();
            Medicos datosMedico = null;

            while (resultSet.next()) {
                datosMedico = mapToMedico(resultSet);
            }
            return datosMedico;
        } catch (SQLException e) {
            System.out.println("La aplicacion ha fallado en getByUserID Medico Repositorio");
            return null;
        }
    }

    private Medicos mapToMedico(ResultSet resultSet) {

        try {
            int id = resultSet.getInt("ID");
            int idUsuario = resultSet.getInt("IDUSUARIO");
            String apellido1 = resultSet.getString("APELLIDO1");
            String apellido2 = resultSet.getString("APELLIDO2");
            String dni = resultSet.getString("DNI");

            return new Medicos(id,idUsuario,null,apellido1,apellido2,dni);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Medicos getByMedicoId(int id)  {
        String query = "SELECT * FROM medicos WHERE  id = ?";

        try {
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Medicos datosMedico = null;

            while (resultSet.next()) {
                datosMedico = mapToMedico(resultSet);
            }
            return datosMedico;
        } catch (SQLException e) {
            System.out.println("La aplicacion ha fallado en getByMedicoId Medico Repositorio");
            return null;
        }
    }


}
