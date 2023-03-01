package service;
import dtos.MedicosDto;
import dtos.PacientesDto;
import repository.entities.Medicos;

import java.sql.SQLException;

public interface MedicosService {

    // estructura de la funcion // tipo de respuesta int objeto string
    //nombre de la funcion
    // parametros de entrada ()

    MedicosDto recuperarMedicoByUsuario(int id) throws SQLException;
    MedicosDto recuperarMedicoById(int id);


}
