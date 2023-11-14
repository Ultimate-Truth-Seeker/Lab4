package Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Programa para manejo de página de vuelos
 * 
 * Nota: los csv solo guardan datos de inicio de sesión de usuario y confirmaciones, no datos de reservas
 * @author Ultimate-Truth-Seeker
 * @version 13/11/2023
 */
public class Lab4 {
    public static void main(String[] args) {
        List<UsuarioBase> users = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean menu = true;
        int indexloged = -1;
        while (menu) {
            System.out.println("Bienvenido, elija una opción: \n1.Registro\n2.Ingresar/Salir\n3.Reserva\n4.Confirmación\n5.Perfil\n6.Salir");
            int op = s.nextInt();
            switch (op) {
                case 1:
                    s.nextLine();
                    System.out.println("Ingrese nombre de usuario:");
                    String usuario = s.nextLine();
                    System.out.println("Ingrese contraseña");
                    String contraseña = s.nextLine();
                    int o;
                    do {
                        System.out.println("Ingrese 1 si desea un plan básico, o 2 si desea se un usuario premium");
                        o = s.nextInt();
                    } while (o < 0 || o > 2) ;
                    boolean básico = false;
                    if (o==1){
                        básico = true;
                    }
                    
                    users.add(new UsuarioBase(usuario, contraseña, básico));
                    System.out.println("Nuevo usuario registrado");
                    break;
            
                case 2:
                s.nextLine();
                    if (indexloged == -1) {
                        System.out.println("Inicio de sesión: \nIngrese su nombre de usuario");
                        usuario = s.nextLine();
                        System.out.println("Ingrese su contraseña");
                        contraseña = s.nextLine();
                        for (UsuarioBase u : users) {
                            if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)){
                                indexloged = users.indexOf(u);
                                System.out.println("Sesión iniciada");
                                if (users.get(indexloged).isBásico()) {
                                    System.out.println("Actualizate a premium y obten nuevos beneficios!\n1.Sí quiero, 2.No gracias");
                                    int opp = s.nextInt();
                                    if (opp == 1) {
                                        users.get(indexloged).mejorar();
                                        System.out.println("Mejora realizada");
                                    }
                                }
                                break;
                            }
                        }
                        System.out.println("Error, revise sus datos de inicio de sesión");
                    } else {
                        indexloged = -1;
                        System.out.println("Sesión finalizada");
                    }
                    break;
                
                case 3:
                if (indexloged == -1){
                    System.out.println("Inicie sesión primero");
                    break;
                }
                    System.out.println("Reserva de vuelo:");
                    users.get(indexloged).setVueloInicio();
                    users.get(indexloged).setVueloFinal();
                    users.get(indexloged).setBoletos();
                    users.get(indexloged).setAerolinea();
                    System.out.println("Datos de la reserva:");
                    if (users.get(indexloged).isIdaVuelta()) {
                        System.out.println("Fecha de Ida: " + users.get(indexloged).getIda() + ", Fecha de vuelta: " + users.get(indexloged).getVuelta() + ", Cantidad de boletos: " + users.get(indexloged).getBoletos() + ", Aerolínea: " + users.get(indexloged).getAerolínea());
                    } else {
                        System.out.println("Fecha de Ida: " + users.get(indexloged).getIda() + ", Cantidad de boletos: " + users.get(indexloged).getBoletos() + ", Aerolínea: " + users.get(indexloged).getAerolínea());
                    }
                    break;
            
                case 4:
                if (indexloged == -1){
                    System.out.println("Inicie sesión primero");
                    break;
                }
                    if (users.get(indexloged).VerificarReserva()){
                        users.get(indexloged).setTarjeta();
                        
                            users.get(indexloged).setCuotas();
                            users.get(indexloged).setClaseVuelo();
                        
                        //TODO: itinerario
                        
                            users.get(indexloged).AsignacionAsiento();
                            users.get(indexloged).setNumMaleta();
                        
                    } else {
                        System.out.println("Complete la información de reserva primero");
                    }
                    break;
            
                case 5:
                if (indexloged == -1){
                    System.out.println("Inicie sesión primero");
                    break;
                }
                    if (users.get(indexloged).isBásico()) {
                        System.out.println("Elija una opción: 1. Modificar contraseña, 2. Mejorar a premium, 3. Aplicar cupón de descuento");
                    } else {
                        System.out.println("Elija una opción: 1. Modificar contraseña");
                    }
                    System.out.println("Ingrese cualquier otro número para regresar");
                    int op2 = s.nextInt();
                    
                    if (op2 == 1){
                        users.get(indexloged).ModificarContra();
                    }
                    if (users.get(indexloged).isBásico() && op2 == 2) {
                        users.get(indexloged).mejorar();
                    }
                    if (users.get(indexloged).isBásico() && op2 == 3) {
                        users.get(indexloged).AplicarDescuento();
                    }
            
                case 6:
                    menu = false;
                    break;
            
                default:
                    break;
            }
        }
        s.close();
    }
    
}
