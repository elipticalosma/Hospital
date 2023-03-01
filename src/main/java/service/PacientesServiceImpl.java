package service;
import dtos.OperacionesDto;
import dtos.PacientesDto;
import repository.PacientesRepositorio;
import repository.entities.Operaciones;
import repository.entities.Pacientes;

import java.util.ArrayList;
import java.util.List;

public class PacientesServiceImpl implements PacientesService {
    private final static PacientesRepositorio repositorio = new PacientesRepositorio();
    private final static UserService userService = new UserServiceImpl();
    private final static OperacionesService operacionesService =  new OperacionesServiceImpl();

    public PacientesDto recuperarPacienteByUsuario(int id) {
        Pacientes paciente = repositorio.getByUserId(id);
        return cambioDto(paciente);
    }

    @Override
    public PacientesDto recuperarPacienteById(int id)  {

        Pacientes paciente = repositorio.getByPacienteId(id);
        return cambioDto(paciente);
    }

    @Override
    public List<PacientesDto> recuperarPacienteByIdMedico(int id) {

        List<Pacientes> pacientes = repositorio.getPacienteByIdMedico(id);
        List<PacientesDto> resultados = new ArrayList<>();

        for(Pacientes paciente : pacientes){
            resultados.add(cambioDto(paciente));
        }
        return resultados;
    }

    private PacientesDto cambioDto(Pacientes paciente) {

        return new PacientesDto(
                paciente.getId(), paciente.getApellido1(), paciente.getApellido2(), paciente.getGrupoSanguineo(),
                paciente.getFechaIngregso(), paciente.getFechaAlata(), paciente.getDiagnostico(), paciente.getEnfermeroAsignado(),
                paciente.getMedicoAsignado(), paciente.getTratamiento(), paciente.getRecetas(),
                userService.getUserById(paciente.getIdusuario()),operacionesService.recuperarOperacionesPaciente(paciente.getId()));
    }
}
