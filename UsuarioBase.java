package Lab4;

import java.util.Random;
import java.util.Scanner;
/**
 * Clase que implementa la interfaz común de Base para los usuarios
 * @author Ultimate-Truth-Seeker
 * @version 13/11/2023
 */
public class UsuarioBase implements Base{
    private String usuario;
    private String contraseña;
    private boolean básico;
    private boolean idaVuelta;
    private String ida;
    private String vuelta;
    private int Boletos;
    private String aerolínea;
    private int tarjeta;
    private int cuotas;
    private String ClaseVuelo;
    private int asiento;
    private int maletas;
    private float descuento;
    
    public UsuarioBase(String usuario, String contraseña, boolean básico) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.básico = básico;
    }

    public void AplicarDescuento(){
        this.descuento += 0.1;
    }
   
    public boolean VerificarReserva() {
        if (ida == null){ 
            return false;
        }
        if (idaVuelta && vuelta == null) {
            return false;
        }
        if (Boletos < 1 || aerolínea == null){
            return false;
        }
        return true;
    }
    /**
     * método para subir la categoría de usuario. Fue necesario añadirlo como un extra porque no había un método para hacerlo
     */
    public void mejorar(){
        setTarjeta();
        this.básico = false;
    }

    

    @Override
    public void AsignacionAsiento() {
        if (básico = true) {
            Random r = new Random();
            asiento = r.nextInt(100);
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println("Premium: escoja su número de asiento:");
            this.asiento = s.nextInt();
            
        }
    }

    @Override
    public void ModificarContra() {
        System.out.println("Ingrese su nueva contraseña:");
        Scanner ss = new Scanner(System.in);
        contraseña = ss.nextLine();
        
        
    }

    @Override
    public void setAerolinea() {
        System.out.println("Escriba la aerolínea en la que desea volar:");
        Scanner s = new Scanner(System.in);
        aerolínea = s.nextLine();

        
    }

    @Override
    public void setBoletos() {
        System.out.println("Ingrese el número de boletos:");
        Scanner s = new Scanner(System.in);
        Boletos = s.nextInt();
        while (Boletos < 1) {
            Boletos = s.nextInt();
        }

        
    }

    @Override
    public void setClaseVuelo() {
        if (básico) {
            System.out.println("Ingrese 1 para vuelo en coach o 2 para vuelo en primera clase:");
            Scanner s = new Scanner(System.in); int oo;
            do {
                oo = s.nextInt();
            } while (oo < 1 || oo > 2);
            if (oo == 1) {
                ClaseVuelo = "Coach";
            } else if (oo == 2) {
                ClaseVuelo = "PrimeraClase";
            }

        } else {
            System.out.println("Premium: usted vuela en primera clase");
            ClaseVuelo = "PrimeraClase";
        }
        
    }

    @Override
    public void setCuotas() {
        if (básico) {
            System.out.println("Ingrese el número de cuotas a pagar:");
            Scanner s = new Scanner(System.in);
            cuotas = s.nextInt();
            while (cuotas < 1 || cuotas > 24){
                System.out.println("Debe ser entre 1 y 24");
                cuotas = s.nextInt();
            }

        } else {
            System.out.println("Premium: su pago es de contado");
            cuotas  = 1;
        }
        
    }

    @Override
    public void setNumMaleta() {
        if (básico == false) {
            System.out.println("Premium: Ingrese el número de maletas a llevar:");
            Scanner s = new Scanner(System.in);
            maletas = s.nextInt();

        } else {
            maletas = 1;
        }
        
    }

    @Override
    public void setTarjeta() {
        System.out.println("Ingrese su número de tarjeta para pagar:");
        Scanner s = new Scanner(System.in);
        tarjeta = s.nextInt();

        
    }

    @Override
    public void setVueloFinal() {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Es un viaje de ida y vuelta? 1.Sí, 2.No");
        int op = s.nextInt();
        while (op < 1 || op > 2) {
            op = s.nextInt();
        }
        if (op == 1) {
            System.out.println("Ingrese el año del vuelo:");
            int yy = s.nextInt();
            System.out.println("Ingrese el mes del vuelo:");
            int mm = s.nextInt();
            System.out.println("Ingrese el día de vuelta de viaje:");
            int dd = s.nextInt();
            vuelta = dd+"/"+mm+"/"+yy;
            idaVuelta = true;

        } else {
            idaVuelta = false;
        }
    }

    @Override
    public void setVueloInicio() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el año del vuelo:");
        int yy = s.nextInt();
        System.out.println("Ingrese el mes del vuelo:");
        int mm = s.nextInt();
        System.out.println("Ingrese el día de inicio de viaje:");
        int dd = s.nextInt();
        ida = dd+"/"+mm+"/"+yy;

        
    }







    public String getUsuario() {
        return usuario;
    }







    public String getContraseña() {
        return contraseña;
    }







    public boolean isBásico() {
        return básico;
    }







    public boolean isIdaVuelta() {
        return idaVuelta;
    }







    public String getIda() {
        return ida;
    }







    public String getVuelta() {
        return vuelta;
    }







    public int getBoletos() {
        return Boletos;
    }







    public String getAerolínea() {
        return aerolínea;
    }







    public int getTarjeta() {
        return tarjeta;
    }







    public int getCuotas() {
        return cuotas;
    }







    public String getClaseVuelo() {
        return ClaseVuelo;
    }







    public int getAsiento() {
        return asiento;
    }







    public int getMaletas() {
        return maletas;
    }







    public float getDescuento() {
        return descuento;
    }
    
   
    
}
