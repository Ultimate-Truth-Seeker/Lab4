package Lab4;

import java.util.Scanner;

public class UsuarioBase implements Base{
    private String usuario;
    private String contraseña;
    private boolean Básico;
    private String aerolínea;
    private int asiento;
    private int Boletos;
    private String ClaseVuelo;

    private int cuotas;

    @Override
    public void AsignacionAsiento() {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        asiento = s.nextInt();
        
    }

    @Override
    public void ModificarContra() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAerolinea() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setBoletos() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setClaseVuelo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setCuotas() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setNumMaleta() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setTarjeta() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setVueloFinal() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setVueloInicio() {
        // TODO Auto-generated method stub
        
    }
    
   
    
}
