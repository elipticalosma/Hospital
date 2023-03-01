package repository;

import configurations.ConfigH2;
import repository.entities.Operaciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperacionesRepositorio {

    public List<Operaciones> getOperacionesByIdPaciente(int idPaciente) {
        try {
            String query = "SELECT * FROM operaciones WHERE  idPaciente = ?";
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

            statement.setInt(1, idPaciente);
            ResultSet resultSet = statement.executeQuery();
            List<Operaciones> listaOperaciones = new ArrayList<>();

            while (resultSet.next()) {
                listaOperaciones.add(mapOperaciones(resultSet));
            }
            return listaOperaciones;
        } catch (SQLException e) {
            System.out.println("La operacion ha fallado getOperacionesByIdPaciente Operaciones Repositorio");
            return null;
        }
    }

    private Operaciones mapOperaciones(ResultSet resultSet) {

        try {
            int id = resultSet.getInt("ID");
            int idMedico = resultSet.getInt("IDMEDICO");
            int idPaciente = resultSet.getInt("IDPACIENTE");
            Date fechaOperacion = resultSet.getDate("FECHAOPERACION");

            return new Operaciones(id, idMedico, idPaciente, fechaOperacion);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Operaciones> getOperacionesByIdMedico(int idMedico) {

        try {
            String query = "SELECT * FROM operaciones WHERE  idMedico = ?";
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

            statement.setInt(1, idMedico);
            ResultSet resultSet = statement.executeQuery();
            List<Operaciones> listaOperaciones = new ArrayList<>();

            while (resultSet.next()) {
                listaOperaciones.add(mapOperaciones(resultSet));
            }
            return listaOperaciones;
        } catch (SQLException e) {
            System.out.println("Ha fallado en getByOperacionesIdMedico Operaciones Repositorio");
            return null;
        }
    }

    public Operaciones getOperacionesById(int id) {

        try {

            String query = "SELECT * FROM operaciones WHERE  id = ?";
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            Operaciones operacion = null;

            if (resultSet.next()) {
                operacion = mapOperaciones(resultSet);
            }
            return operacion;

        } catch (SQLException e) {
            System.out.println("Ha fallado en getOperacionesById Operaciones Repositorio");
            return null;
        }
    }

    public boolean deleteOperacion(int idOperacion) {
        boolean resultado = false;
        try {

            String query = "DELETE FROM operaciones WHERE  id = ?";
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);
            statement.setInt(1, idOperacion);
            ResultSet resultSet = statement.executeQuery();
            int valor = statement.executeUpdate(query);

            if (valor > 0) {
                resultado = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ha fallado en deleteOperacion Operaciones Repositorio");
        } return resultado;
    }
}


