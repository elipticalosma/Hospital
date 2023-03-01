
/* Hospital
        El ejercicio consiste en crear el sistema informatico de un hospital.

        caracteristicas:
        1000 habitaciones (individuales).
        300 camillas.
        50 medicos y 200 enfermer@s.
        Sala de espera de hasta 50 personas.
        *Se ira añadiendo mas informacion.
        funcionalidades de usuarios:
Pacientes
        Acceder a su historial medico
Enfermer@s
        Dar de alta un paciente
        Modificar historial paciente
        Tratar paciente
        Recetar a un paciente
        Asignar un medico por especialidad
        consultar pacientes
        Registrar enfermedad
Medico
        Operar
        Tratar un paciente
        Recetar
        Dar de alta
        consultar pacientes
        asignar enfermer@s
        Registrar enfermedad

        Otras funciones:
        Los pacientes tendran diferentes niveles de urgencia
        Los pacientes pueden tener diferentes enfermedades (repartidas por especialidad)
        Los pacientes seran asignados segun especialidad
        Los pacientes se generaran automaticamente y manualmente.
        Podran ocurrir desastres que generen entre 100 y 3000 pacientes.
        Cada enfermedad requiere especialistas y tiempos diferentes.
        Los pacientes solo se podran tratar cada X tiempo segun su enfermedad.

*/

import service.UserServiceImpl;
import java.io.*;
import static configurations.ConfigH2.*;

public class Principal {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static UserServiceImpl service = new UserServiceImpl();

    public static void main(String[] args) {

        int opcion = 0;

        do {
            try {

                System.out.println("BIENVENIDOS AL HOSPITAL");
                System.out.println("Seleccionar una Opcion");
                System.out.println("1. LOGIN");
                System.out.println("0. SALIR");
                opcion = Integer.parseInt(buffer.readLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese DNI");
                        String user = buffer.readLine();
                        System.out.println("Ingrese Contraseña");
                        String pass = buffer.readLine();
                        service.login(user, pass);
                    }
                    case 0 -> {
                        System.out.println("Saliendo de la Base de Datos \n");
                        cerrarConexion();
                    }
                    default -> System.out.println("Opcion no valida \n");
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } while (opcion != 0);

    }
}
