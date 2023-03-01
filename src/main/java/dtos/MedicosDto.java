package dtos;
// esto es igual que medico con sus getter y setter pero con los parametros que no queremos mostrar


import java.util.List;

public class MedicosDto {
    private int id;
    private String apellido1;
    private String apellido2;
    private UserDto userInfo;
    private List<OperacionesDto> operacionesInfo;

    public MedicosDto(int id, String apellido1, String apellido2, UserDto userInfo, List<OperacionesDto> operacionesInfo) {
        this.id = id;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
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
        return "Id Medico = " + id +
                " Nombre y Apellidos = " + userInfo.getUserName() +" " + apellido1 +" " + apellido2 +"\n";
    }
}

