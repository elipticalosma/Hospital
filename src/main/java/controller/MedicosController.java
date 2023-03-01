package controller;
import dtos.MedicosDto;
import dtos.OperacionesDto;
import dtos.PacientesDto;
import repository.entities.User;
import service.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import static configurations.ConfigH2.cerrarConexion;

// mostrar el menu y la opciones

public class MedicosController {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static MedicosService serviceMedico = new MedicosServiceImpl();
    public static PacientesService servicePaciente = new PacientesServiceImpl();
    public static OperacionesService serviceOperaciones = new OperacionesServiceImpl();


    public static void menu(User usuario) {

        int opcion = 0;
        do {
            try {

                System.out.println("BIENVENID@ " + usuario.getUserName() + " AL MENU PRINCIPAL PARA MEDIC@S \n");
                MedicosDto medico = serviceMedico.recuperarMedicoByUsuario(usuario.getId());
                List<PacientesDto> pacientes = servicePaciente.recuperarPacienteByIdMedico(medico.getId());

                System.out.println(medico + "\n");

                System.out.println("PACIENTES ASIGNADOS \n");

                for (PacientesDto pacientesAsignado : pacientes) {
                    System.out.println(pacientesAsignado);
                }

                System.out.println(" \n OPERACIONES PROGRAMADAS \n");


                for (OperacionesDto operaciones : medico.getOperacionesInfo()) {

                    System.out.println( "Id Operacion = " +
                            serviceOperaciones.operacionesDetails(
                                    operaciones.getId()
                            ).getId() + " " +
                            "Nombre y Apellidos = " +
                            serviceOperaciones.operacionesDetails(
                                    operaciones.getId()
                            ).getPaciente().getUserInfo().getUserName() + " " +

                                    serviceOperaciones.operacionesDetails(
                                            operaciones.getId()
                                    ).getPaciente().getApellido1() + " " +

                                    serviceOperaciones.operacionesDetails(
                                            operaciones.getId()
                                    ).getPaciente().getApellido1() + " --> Dia Operacion --> " +
                                    serviceOperaciones.operacionesDetails(
                                            operaciones.getId()
                                    ).getPaciente().getOperacionesInfo() +"\n"
                    );
                }

                System.out.println("\n Seleccionar una Opcion");
                System.out.println("1. OPERAR\t 2. TRATAR PACIENTE\t 3. CONSULTAR PACIENTES");
                System.out.println("4. ASIGNAR ENFERMERAS\t 5. REGISTRAR ENFERMEDAD\t 6. DAR DE ALTA MEDICA A PACIENTE");
                System.out.println("0. Salir");


                opcion = Integer.parseInt(buffer.readLine());

                switch (opcion) {
                    case 1 -> {

                        System.out.println("ID Operacion a Efectuar");
                        int idOperacion = Integer.parseInt(buffer.readLine());

                        if(!serviceOperaciones.deleteOperacion(idOperacion)){
                            System.out.println("La Operacion ha sido Exitosa");
                        }else{
                            System.out.println("La Operacion ha Fallado");
                        }
                    }
                    case 2 -> {
                        System.out.println("TRATAR PACIENTE");
                    }
                    case 3 -> {
                        System.out.println("CONSULTAR PACIENTE");
                    }
                    case 4 -> {
                        System.out.println("ASIGNAR ENFERMEDAD");
                    }
                    case 5 -> {
                        System.out.println("REGISTRAR ENFERMEDAD");
                    }
                    case 6 -> {
                        System.out.println("DAR DE ALTA MEDICA A PACIENTES");
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


