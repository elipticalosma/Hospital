package dtos;

import java.util.Date;

public class OperacionDetailsDto {

    private int id;
    private MedicosDto medico;
    private PacientesDto paciente;

    private Date fechaOperacion;

    public OperacionDetailsDto(int id, MedicosDto medico, PacientesDto paciente, Date fechaOperacion) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.fechaOperacion = fechaOperacion;
    }
    public OperacionDetailsDto(int id, Date fechaOperacion) {
        this.id = id;
        this.fechaOperacion = fechaOperacion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MedicosDto getMedico() {
        return medico;
    }

    public void setMedico(MedicosDto medico) {
        this.medico = medico;
    }

    public PacientesDto getPaciente() {
        return paciente;
    }

    public void setPaciente(PacientesDto paciente) {
        this.paciente = paciente;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    @Override
    public String toString() {
        return "OperacionDetailsDto{" +
                "id=" + id +
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", fechaOperacion=" + fechaOperacion +
                '}';
    }
}

