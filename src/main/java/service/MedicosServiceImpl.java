package service;
import dtos.MedicosDto;
import repository.MedicoRepositorio;
import repository.entities.Medicos;

// logica de al funcion
// recuperar medico llamando al repositorio
// convertir medico a DTO
// MISMO PATRON PARA TODAS LAS FUNCIONALIDADES

public class MedicosServiceImpl implements MedicosService {
    private final static MedicoRepositorio repositorio = new MedicoRepositorio();
    private final static UserService userService = new UserServiceImpl();
    private final static OperacionesService operacionesService =  new OperacionesServiceImpl();



    @Override
    public MedicosDto recuperarMedicoByUsuario(int id) {
        Medicos medico = repositorio.getByUserId(id);
        return cambioDto(medico);
    }

    @Override
    public MedicosDto recuperarMedicoById(int id) {
        Medicos medico = repositorio.getByMedicoId(id);
        return cambioDto(medico);
    }


    private MedicosDto cambioDto(Medicos medico)  {

        return new MedicosDto(
                medico.getId(), medico.getApellido1(), medico.getApellido2(),
                userService.getUserById(medico.getIdUsuario()),
                operacionesService.recuperarOperacionesMedico(medico.getId()));
    }
}