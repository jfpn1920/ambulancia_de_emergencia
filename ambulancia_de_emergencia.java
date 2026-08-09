import java.util.Scanner;
public class ambulancia_de_emergencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] pacientes = new String[10];
        int[] edades = new int[10];
        String[] ubicaciones = new String[10];
        String[] emergencias = new String[10];
        String[] ambulancias = new String[10];
        String[] conductores = new String[10];
        String[] paramedicos = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------------//
        //--|menu_principal_ambulancia_de_emergencia|--//
        //---------------------------------------------//
        do {
            System.out.println("menu principal ambulancia de emergencia");
            System.out.println("1) Registrar emergencia");
            System.out.println("2) Editar emergencia");
            System.out.println("3) Listar emergencias");
            System.out.println("4) Buscar emergencia");
            System.out.println("5) Eliminar emergencia");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------------//
                //--|registrar_emergencia|--//
                //--------------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro de la emergencia");
                    System.out.println("id de la emergencia a registrar: " + id);
                    System.out.print("nombre del paciente: ");
                    pacientes[total] = entrada.nextLine();
                    System.out.print("edad del paciente: ");
                    edades[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("ubicacion de la emergencia: ");
                    ubicaciones[total] = entrada.nextLine();
                    System.out.print("tipo de emergencia: ");
                    emergencias[total] = entrada.nextLine();
                    System.out.print("ambulancia asignada: ");
                    ambulancias[total] = entrada.nextLine();
                    System.out.print("nombre del conductor: ");
                    conductores[total] = entrada.nextLine();
                    System.out.print("nombre del paramedico: ");
                    paramedicos[total] = entrada.nextLine();
                    System.out.print("estado de la atencion: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Emergencia registrada correctamente.");
                    total++;
                    break;
                //-----------------------//
                //--|editar_emergencia|--//
                //-----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen emergencias registradas.");
                        break;
                    }
                    System.out.println("Datos de las emergencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Paciente: " + pacientes[i] + " | Edad: " + edades[i] + " | Ubicacion: " + ubicaciones[i] + " | Emergencia: " + emergencias[i] + " | Ambulancia: " + ambulancias[i] + " | Conductor: " + conductores[i] + " | Paramedico: " + paramedicos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la emergencia: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato de la emergencia");
                        System.out.print("Nuevo nombre del paciente: ");
                        pacientes[posicion] = entrada.nextLine();
                        System.out.print("Nueva edad del paciente: ");
                        edades[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nueva ubicacion: ");
                        ubicaciones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de emergencia: ");
                        emergencias[posicion] = entrada.nextLine();
                        System.out.print("Nueva ambulancia asignada: ");
                        ambulancias[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del conductor: ");
                        conductores[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del paramedico: ");
                        paramedicos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de la atencion: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Emergencia actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|listar_emergencias|--//
                //------------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen emergencias registradas.");
                    } else {
                        System.out.println("Lista de emergencias");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Paciente: " + pacientes[i] + " | Edad: " + edades[i] + " | Ubicacion: " + ubicaciones[i] + " | Emergencia: " + emergencias[i] + " | Ambulancia: " + ambulancias[i] + " | Conductor: " + conductores[i] + " | Paramedico: " + paramedicos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-----------------------//
                //--|buscar_emergencia|--//
                //-----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen emergencias registradas.");
                        break;
                    }
                    System.out.println("busqueda de emergencia");
                    System.out.print("ingresa la id para buscar emergencia: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la emergencia encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Paciente: " + pacientes[posicion] + " | Edad: " + edades[posicion] + " | Ubicacion: " + ubicaciones[posicion] + " | Emergencia: " + emergencias[posicion] + " | Ambulancia: " + ambulancias[posicion] + " | Conductor: " + conductores[posicion] + " | Paramedico: " + paramedicos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------------//
                //--|eliminar_emergencia|--//
                //-------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen emergencias registradas.");
                        break;
                    }
                    System.out.println("Datos de las emergencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Paciente: " + pacientes[i] + " | Edad: " + edades[i] + " | Ubicacion: " + ubicaciones[i] + " | Emergencia: " + emergencias[i] + " | Ambulancia: " + ambulancias[i] + " | Conductor: " + conductores[i] + " | Paramedico: " + paramedicos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la emergencia a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            pacientes[i] = pacientes[i + 1];
                            edades[i] = edades[i + 1];
                            ubicaciones[i] = ubicaciones[i + 1];
                            emergencias[i] = emergencias[i + 1];
                            ambulancias[i] = ambulancias[i + 1];
                            conductores[i] = conductores[i + 1];
                            paramedicos[i] = paramedicos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Emergencia eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Ambulancia de Emergencia.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}