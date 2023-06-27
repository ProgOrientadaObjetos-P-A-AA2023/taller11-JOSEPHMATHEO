package paquete02;

import java.util.ArrayList;
import paquete03.*;

public class Cuenta {
    
    private String nombre;
    private double iva;
    private double subtotal;
    private ArrayList<Menu> listado;
    private double valortotal;
    
    public Cuenta(String n, double i, ArrayList<Menu> li){
    
        nombre = n;
        iva = i;
        listado = li;
        
    }

    public void establecerNombre(String s) {
        
        nombre = s;
        
    }

    public void establecerIva(double f) {
        
        iva = f;
        
    }

    public void establecerListado(ArrayList<Menu> l) {
        
        listado = l;
        
    }

    public void calcularSubtotal() {
        
        double suma = 0;
        
        for(int i = 0; i < listado.size(); i++) {
            
            subtotal = subtotal + listado.get(i).obtenerValorMenu();
            
        }
        
    }
    
    

    public void calcularValortotal() {
        
        for(int i = 0; i < listado.size(); i++){
        
            valortotal = valortotal + listado.get(i).obtenerValorMenu();
        
        }
        
    }

    public String obtenerNombre() {
        
        return nombre;
        
    }

    public double obtenerIva() {
        
        return iva;
        
    }

    public ArrayList<Menu> obtenerListado() {
        
        return listado;
        
    }

    public double obtenerSubtotal() {
        
        return subtotal;
        
    }
    
    public double obtenerValortotal() {
        
        return valortotal;
        
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Factura %s\n"
                + "Cliente: %s\n");
        
        for(int i =0; i < listado.size(); i++){
        
            cadena = String.format("%s"
                    + "%s",
                    cadena,
                    listado.get(i));
        
        }
        
        cadena = String.format("%s\n"
                + "Subtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Total a Pagar: %.2f",
                cadena,
                subtotal,
                valortotal);
    
        return cadena;
        
    }
    
}
