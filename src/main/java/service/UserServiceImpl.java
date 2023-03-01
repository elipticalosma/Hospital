package service;
import controller.AdminController;
import controller.EnfermerosController;
import controller.MedicosController;
import controller.PacientesController;
import dtos.LogingDto;
import dtos.UserDto;
import repository.UserRepositorio;
import repository.entities.User;
import java.sql.SQLException;


public class UserServiceImpl implements UserService{
    private final static UserRepositorio repositorio = new UserRepositorio();
    public static User usuarioLogeado = null;
        @Override
        public boolean login(String user, String pass) throws SQLException {


            usuarioLogeado = repositorio.logingUser(user, pass);

            if (usuarioLogeado != null){
                System.out.println("Login Corecto \n");

                    switch (usuarioLogeado.getActividad()) {
                        case MEDICO -> MedicosController.menu(usuarioLogeado);
                        case ENFERMERO -> EnfermerosController.menu(usuarioLogeado);
                        case PACIENTE -> PacientesController.menu(usuarioLogeado);
                        case ADMIN -> AdminController.menu(usuarioLogeado);
                    }

            }else{
                System.out.println("Login Fallido \n");
            }
            return false;
        }

    @Override
    public LogingDto getLoggedUser() {

        return  new LogingDto(
               usuarioLogeado.getUserName(), usuarioLogeado.getDni()
        );
    }

    @Override
    public UserDto getUserById(int id) {
        return cambioDto(repositorio.getById(id));
    }

    public UserDto cambioDto(User usuario){
            return new UserDto(usuario.getId(),usuario.getUserName(),usuario.getDni(),usuario.getPass(),usuario.getActividad());
    }


}

