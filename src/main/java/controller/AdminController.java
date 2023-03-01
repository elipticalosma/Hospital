package controller;
import repository.AdminRepositorio;
import repository.entities.User;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// mostrar el menu y la opciones

public class AdminController {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static void menu( User usuario) {

        int opcion = 0;
        do {
            try {

                System.out.println("BIENVENID@ " + usuario.getUserName() + " AL MENU PRINCIPAL PARA ADMINISTRADORES");
                System.out.println("\n Seleccionar una Opcion");
                System.out.println("1. MENU CREAR");
                System.out.println("2.MENU ELIMINAR");
                System.out.println("0. Salir");

                opcion = Integer.parseInt(buffer.readLine());

                switch (opcion) {
                    case 1 -> { /*admin servir*/ }
                    case 2->{}
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } while (opcion != 0);

    }
}
