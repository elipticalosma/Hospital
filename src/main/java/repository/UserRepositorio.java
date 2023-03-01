package repository;
import configurations.ConfigH2;
import repository.entities.Actividad;
import repository.entities.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositorio {


    public  User logingUser(String dni, String pass) throws SQLException {


        String query = "SELECT * FROM usuarios WHERE dni = ? AND password = ?";
        PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);

        statement.setString(1,dni);
        statement.setString(2,pass);
        ResultSet resultSet = statement.executeQuery();
       User usuarioLogeado = null;

        while (resultSet.next()) {

            int id = resultSet.getInt("ID");
            String nombre = resultSet.getString("NOMBRE");
            dni = resultSet.getString("DNI");
            int password = resultSet.getInt("PASSWORD");
            Actividad actividad = Actividad.valueOf(resultSet.getString("ACTIVIDAD"));
            usuarioLogeado =new User(id,nombre,dni,password,actividad);
        }
        return usuarioLogeado;
    }

    public  List<User> recuperarUsuarios() throws SQLException {


        Statement statement = ConfigH2.getConnection().createStatement();
        String sql = "select * from USUARIOS";
        ResultSet resultSet = statement.executeQuery(sql);
        List<User> listaUsuarios = new ArrayList<>();

        while (resultSet.next()) {

            int id = resultSet.getInt("ID");
            String nombre = resultSet.getString("NOMBRE");
            String dni = resultSet.getString("DNI");
            int password = resultSet.getInt("PASSWORD");
            Actividad actividad = Actividad.valueOf(resultSet.getString("ACTIVIDAD"));

           listaUsuarios.add(
                   new User(id,nombre,dni,password,actividad )
           );
        }
        return listaUsuarios;
    }

    public  User getById(int id) {

        try {
            String query = "select * from USUARIOS WHERE id = ? ";
            PreparedStatement statement = ConfigH2.getConnection().prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            User datosUser = null;

            while (resultSet.next()) {

                id = resultSet.getInt("ID");
                String nombre = resultSet.getString("NOMBRE");
                String dni = resultSet.getString("DNI");
                int password = resultSet.getInt("PASSWORD");
                Actividad actividad = Actividad.valueOf(resultSet.getString("ACTIVIDAD"));
                datosUser = new User (id, nombre, dni, password, actividad);
            }
            return datosUser;

        } catch (SQLException e) {
            System.out.println("Fallo en el getById del user repositorio");
            throw new RuntimeException(e);
        }
    }
}
