package paquete01;

import paquete02.*;
import paquete03.*;
import java.util.ArrayList;

public class Ejecutor02 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
         };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
        
        // Lista de Menus
        
        ArrayList<Menu> lista = new ArrayList<>();
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        
        // Inicio de solución
        
        for(int i = 0; i < datos001.length; i++){
            
            for(int j =0; j < 1 ; j++){
                
                String nombre = datos001[i][j];
                double valori = Double.parseDouble( datos001[i][j+1]);
                double valorpH = Double.parseDouble( datos001[i][j+2]);
                double valorpP = Double.parseDouble( datos001[i][j+3]);
                
                MenuNinos menuN = new MenuNinos(nombre, valori, valorpH, valorpP);
                lista.add(menuN);
                
            }
            
        }
        
        for(int i = 0; i < datos002.length; i++){
            
            for(int j =0; j < 1 ; j++){
                
                String nombre = datos002[i][j];
                double valori = Double.parseDouble( datos002[i][j+1]);
                double desc = Double.parseDouble( datos002[i][j+2]);
                
                MenuEconomico menuE = new MenuEconomico(nombre, valori, desc);
                lista.add(menuE);
                
            }
            
        }
        
        for(int i = 0; i < datos003.length; i++){
            
            for(int j =0; j < 1; j++){
                
                String nombre = datos003[i][j];
                double valori = Double.parseDouble( datos003[i][j+1]);
                double valorpPo = Double.parseDouble( datos003[i][j+2]);
                double valorpB = Double.parseDouble( datos003[i][j+3]);
                
                MenuDia menuD = new MenuDia(nombre, valori, valorpPo, valorpB);
                lista.add(menuD);
                
            }
            
        }
        
        for(int i = 0; i < datos004.length; i++){
            
            for(int j =0; j < 1; j++){
                
                String nombre = datos004[i][j];
                double valori = Double.parseDouble( datos004[i][j+1]);
                double guarnision = Double.parseDouble( datos004[i][j+2]);
                double valorBeb = Double.parseDouble( datos004[i][j+3]);
                double porcentaje = Double.parseDouble( datos004[i][j+4]);
                
                MenuCarta menuC = new MenuCarta(nombre, valori, guarnision, valorBeb, porcentaje );
                lista.add(menuC);
                
            }
            
        }
        
        // Fin de solución
        
        
        for (int i = 0; i < lista.size(); i++) {
            
            lista.get(i).calcularValorMenu();
            
        }
        
        // Un objeto de tipo Cuenta
        
        Cuenta miCuenta = new Cuenta("Luis Andrade",10, lista);
        miCuenta.calcularSubtotal();
        miCuenta.calcularValortotal();
        System.out.printf("%s\n", miCuenta);
        
    }
    
}
