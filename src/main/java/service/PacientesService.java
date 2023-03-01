package service;
import dtos.PacientesDto;

import java.util.List;


public interface PacientesService {

    PacientesDto recuperarPacienteByUsuario(int id);

    PacientesDto recuperarPacienteById(int id);

    List<PacientesDto> recuperarPacienteByIdMedico(int id);

}
