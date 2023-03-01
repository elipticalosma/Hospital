package dtos;

import repository.MedicoRepositorio;

import java.util.List;

public class PacientesDto {

    private int id;
    private String apellido1;
    private String apellido2;
    private String grupoSanguineo;
    private String fechaIngregso;
    private String fechaAlata;
    private String diagnostico;
    private String enfermeroAsignado;
    private String medicoAsignado;
    private String tratamiento;
    private String recetas;

    private UserDto userInfo;
    private List<OperacionesDto> operacionesInfo;

    public PacientesDto(int id, String apellido1, String apellido2, String grupoSanguineo, String fechaIngregso,
                        String fechaAlata, String diagnostico, String enfermeroAsignado, String medicoAsignado,
                        String tratamiento, String recetas, UserDto userInfo,
                        List<OperacionesDto> operacionesInfo) {
        this.id = id;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaIngregso = fechaIngregso;
        this.fechaAlata = fechaAlata;
        this.diagnostico = diagnostico;
        this.enfermeroAsignado = enfermeroAsignado;
        this.medicoAsignado = medicoAsignado;
        this.tratamiento = tratamiento;
        this.recetas = recetas;
        this.userInfo = userInfo;
        this.operacionesInfo = operacionesInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getFechaIngregso() {
        return fechaIngregso;
    }

    public void setFechaIngregso(String fechaIngregso) {
        this.fechaIngregso = fechaIngregso;
    }

    public String getFechaAlata() {
        return fechaAlata;
    }

    public void setFechaAlata(String fechaAlata) {
        this.fechaAlata = fechaAlata;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getEnfermeroAsignado() {
        return enfermeroAsignado;
    }

    public void setEnfermeroAsignado(String enfermeroAsignado) {
        this.enfermeroAsignado = enfermeroAsignado;
    }

    public String getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(String medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getRecetas() {
        return recetas;
    }

    public void setRecetas(String recetas) {
        this.recetas = recetas;
    }

    public UserDto getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserDto userInfo) {
        this.userInfo = userInfo;
    }

    public List<OperacionesDto> getOperacionesInfo() {
        return operacionesInfo;
    }

    public void setOperacionesInfo(List<OperacionesDto> operacionesInfo) {
        this.operacionesInfo = operacionesInfo;
    }

    @Override
    public String toString() {

        MedicoRepositorio MedicoRepositorio = null;
        return  "Nombre y Apellidos = " + userInfo.getUserName() +" " + apellido1 + " " + apellido2 + "\n" +
                "Grupo Sanguineo = " + grupoSanguineo + " Enfermero Asignado = " + enfermeroAsignado  + " " +
                "Medico Asignado = " + medicoAsignado + "\n" + "Diagnostico = " + diagnostico +
                " Tratamiento = " + tratamiento + " Receta = " + recetas + "\n" + "Fecha Ingreso = " + fechaIngregso +
                " Fecha Operacion = "+operacionesInfo +  " Fecha Alta = " + fechaAlata + '\n';
    }
}
