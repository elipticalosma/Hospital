package repository.entities;


public class Pacientes {

    private int id;
    private int idusuario;
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

    public Pacientes(int id, int idusuario, String apellido1, String apellido2, String grupoSanguineo,
                     String fechaIngregso, String fechaAlata, String diagnostico,
                     String enfermeroAsignado, String medicoAsignado, String tratamiento, String recetas) {

        this.id = id;
        this.idusuario = idusuario;
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
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    @Override
    public String toString() {
        return "Pacientes{" +
                "id=" + id +
                ", idusuario=" + idusuario +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", fechaIngregso='" + fechaIngregso + '\'' +
                ", fechaAlata='" + fechaAlata + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", enfermeroAsignado='" + enfermeroAsignado + '\'' +
                ", medicoAsignado='" + medicoAsignado + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", recetas='" + recetas + '\'' +
                '}';
    }
}