package dtos;

import repository.entities.Actividad;

public class UserDto {

    private int id;
    private String userName;
    private String dni;
    private int pass;
    private Actividad actividad;

    public UserDto(int id, String userName, String dni, int pass, Actividad actividad) {
        this.id = id;
        this.userName = userName;
        this.dni = dni;
        this.pass = pass;
        this.actividad = actividad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", dni='" + dni + '\'' +
                ", pass=" + pass +
                ", actividad=" + actividad +
                '}';
    }
}
