package Lab4;

import java.util.Scanner;

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

    }
   
    public boolean VerificarReserva() {
        return false;
    }
    /**
     * método para subir la categoría de usuario. Fue necesario añadirlo como un extra porque no había un método para hacerlo
     */
    public void mejorar(){
        this.básico = false;
    }

    

    @Override
    public void AsignacionAsiento() {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        this.asiento = s.nextInt();
        s.close();
        
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
