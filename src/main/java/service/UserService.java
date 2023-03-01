package service;
import dtos.LogingDto;
import dtos.UserDto;

import java.sql.SQLException;

public interface UserService {

    boolean login (String user, String pass) throws SQLException;

    LogingDto getLoggedUser();

    UserDto getUserById(int id);
}
