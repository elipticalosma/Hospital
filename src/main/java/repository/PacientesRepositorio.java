package repository;

import configurations.ConfigH2;
import repository.entities.Pacientes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacientesRepositorio {

    public Pacientes getByUserId(int idUsuario) {
        String query = "SELECT * FROM pacientes WHERE  idUsuario = ?";
        try {
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

            statement.setInt(1, idUsuario);
            ResultSet resultSet = statement.executeQuery();
            Pacientes datosPaciente = null;

            while (resultSet.next()) {
                datosPaciente = mapPaciente(resultSet);
            }
            return datosPaciente;
        } catch (SQLException e) {
            System.out.println("La operacion a falllado getByUserId Paciente Repositorio");
            return null;
        }
    }

    private Pacientes mapPaciente(ResultSet resultSet) {

        try {
            int id = resultSet.getInt("ID");
            int idUsuario = resultSet.getInt("IDUSUARIO");
            String apellido1 = resultSet.getString("APELLIDO1");
            String apellido2 = resultSet.getString("APELLIDO2");
            String grupoSanguineo = resultSet.getString("GRUPOSANGUINEO");
            String fechaIngreso = resultSet.getString("FECHAINGRESO");
            String fechaAlta = resultSet.getString("FECHAALTA");
            String diagnostico = resultSet.getString("DIAGNOSTICO");
            String enfermeroAsignado = resultSet.getString("ENFERMEROASIGNADO");
            String medicoAsignado = resultSet.getString("MEDICOASIGNADO");
            String tratamiento = resultSet.getString("TRATAMIENTO");
            String recetas = resultSet.getString("RECETAS");

            return new Pacientes(id, idUsuario, apellido1, apellido2,
                    grupoSanguineo, fechaIngreso, fechaAlta, diagnostico, enfermeroAsignado, medicoAsignado,
                    tratamiento, recetas);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Pacientes getByPacienteId(int id) {
        String query = "SELECT * FROM pacientes WHERE  id = ?";
        try {
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Pacientes datosPaciente = null;

            while (resultSet.next()) {
                datosPaciente = mapPaciente(resultSet);
            }
            return datosPaciente;
        } catch (SQLException e) {
            System.out.println("La operacion a falllado getIdPacienteById Paciente Repositorio");
            return null;
        }
    }
    public List<Pacientes> getPacienteByIdMedico(int idMedico) {

        String query = "SELECT * FROM pacientes WHERE  medicoAsignado = ?";
        try {
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);
            statement.setInt(1, idMedico);
            ResultSet resultSet = statement.executeQuery();
            List<Pacientes> datosPaciente = new ArrayList<>();

            while (resultSet.next()) {
                datosPaciente.add(mapPaciente(resultSet));
            }
            return datosPaciente;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La operacion a falllado getPacienteByIdMedico Paciente Repositorio");
            return new ArrayList<>();
        }
    }
}
