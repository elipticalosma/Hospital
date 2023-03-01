package controller;

import repository.entities.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static configurations.ConfigH2.cerrarConexion;

public class EnfermerosController {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static void menu( User usuario) {

        int opcion = 0;
        do {
            try {

                System.out.println("BIENVENID@ " + usuario.getUserName() + " AL MENU PRINCIPAL PARA ENFERMER@S");
                System.out.println("Seleccionar una Opcion");
                System.out.println("1. ");
                System.out.println("1. ");
                System.out.println("2. ");
                System.out.println("3. ");
                System.out.println("4. ");
                System.out.println("5. ");
                System.out.println("0. Salir");

                opcion = Integer.parseInt(buffer.readLine());

                switch (opcion) {
                    case 1 -> {System.out.println("1");}
                    case 2 -> {System.out.println("2");}
                    case 3 -> {System.out.println("3");}
                    case 4 -> {System.out.println("4");}
                    case 5 -> {System.out.println("5");}
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
