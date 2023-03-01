package service;
import dtos.OperacionDetailsDto;
import dtos.OperacionesDto;
import repository.OperacionesRepositorio;
import repository.entities.Operaciones;
import java.util.ArrayList;
import java.util.List;


public class OperacionesServiceImpl implements OperacionesService {

    private final static OperacionesRepositorio repositorio = new OperacionesRepositorio();
    private final static MedicosService serviceMedico = new MedicosServiceImpl();
    private final static PacientesService servicePaciente = new PacientesServiceImpl();

    @Override
    public List<OperacionesDto> recuperarOperacionesMedico(int idMedico)  {

        List<Operaciones> operaciones =  repositorio.getOperacionesByIdMedico(idMedico);
        List<OperacionesDto> resultados = new ArrayList<>();

        for (Operaciones operacione : operaciones) {
            resultados.add(getOperacionesDto(operacione));
        }
        return resultados;
    }

    @Override
    public List<OperacionesDto> recuperarOperacionesPaciente(int idPaciente) {

        List<Operaciones> operaciones =  repositorio.getOperacionesByIdPaciente(idPaciente);
        List<OperacionesDto> resultados = new ArrayList<>();

        for (Operaciones operacione : operaciones) {
           resultados.add(getOperacionesDto(operacione));
        }
        return resultados;
    }

    @Override
    public OperacionDetailsDto operacionesDetails(int id) {

        Operaciones operacion = repositorio.getOperacionesById(id);
        OperacionDetailsDto operacionDetailsDto = getOperacionDetailsDto(operacion);

        operacionDetailsDto.setMedico( serviceMedico.recuperarMedicoById(operacion.getIdMedico()));
        operacionDetailsDto.setPaciente( servicePaciente.recuperarPacienteById(operacion.getIdPaciente()));

        return operacionDetailsDto;
    }

    @Override
    public boolean deleteOperacion(int idOperacion) {
        if (!repositorio.deleteOperacion(idOperacion)){
            return true;
        }else{
            return false;
        }
    }

    public OperacionDetailsDto getOperacionDetailsDto(Operaciones operacion) {
        return new OperacionDetailsDto(
                operacion.getId(), operacion.getFechaOperacion());
    }

    @Override
    public OperacionesDto getOperacionesDto(Operaciones operaciones) {
        return new OperacionesDto(
                operaciones.getId(), operaciones.getIdMedico(), operaciones.getIdPaciente(), operaciones.getFechaOperacion());
    }
}


