package service;
import dtos.OperacionDetailsDto;
import dtos.OperacionesDto;
import repository.entities.Operaciones;
import java.util.List;

public interface OperacionesService {
    OperacionesDto getOperacionesDto(Operaciones operaciones);

    List<OperacionesDto> recuperarOperacionesMedico(int idMedico);

     List<OperacionesDto> recuperarOperacionesPaciente(int idPaciente);

     OperacionDetailsDto operacionesDetails(int id);

     boolean deleteOperacion(int idOperacion);
}
