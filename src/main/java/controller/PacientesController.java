package controller;
import dtos.PacientesDto;
import repository.entities.User;
import service.PacientesService;
import service.PacientesServiceImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import static configurations.ConfigH2.cerrarConexion;

public class PacientesController {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static PacientesService service = new PacientesServiceImpl();
    public static void menu( User usuario) {

        int opcion = 0;
        do {
            try {

                System.out.println("BIENVENID@ " + usuario.getUserName() + " AL MENU PRINCIPAL PARA PACIENTES \n");

                PacientesDto paciente = service.recuperarPacienteByUsuario(usuario.getId());
               System.out.println(paciente.toString());


                System.out.println("Seleccionar una Opcion");
                System.out.println("0. Salir");

                opcion = Integer.parseInt(buffer.readLine());

                switch (opcion) {
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
