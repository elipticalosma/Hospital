package dtos;

public class LogingDto {

    public String usuario;
    public String pass;

    public LogingDto(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }




    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "LogingDto{" +
                "usuario='" + usuario + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
