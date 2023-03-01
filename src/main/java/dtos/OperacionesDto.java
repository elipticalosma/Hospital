package dtos;

import java.util.Date;

public class OperacionesDto {

    private int id;
    private int idMedico;
    private int idPaciente ;
    private Date fechaOperacion;

    public OperacionesDto(int id, int idMedico, int idPaciente, Date fechaOperacion) {
        this.id = id;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.fechaOperacion = fechaOperacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    @Override
    public String toString() {
        return "" + fechaOperacion;
    }

}
