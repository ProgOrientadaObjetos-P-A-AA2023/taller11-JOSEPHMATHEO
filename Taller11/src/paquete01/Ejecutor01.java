
package paquete01;

import paquete02.*;
import paquete03.*;
import java.util.ArrayList;

public class Ejecutor01 {
    
    public static void main(String[] args) {
        
        // Solucion
        
        // Creacion de ArrayList de tipo Menu
        
        ArrayList<Menu> lista = new ArrayList();
        
        // 2 objetos de tipo MenuNinos
        
        MenuNinos menuN1 = new MenuNinos("Ninos 01", 2.00, 1.00, 1.50);
        MenuNinos menuN2 = new MenuNinos("Ninos 01", 3.00, 1.00, 1.50);
        
        // 1 objeto de tipo MenuEconomico
        
        MenuEconomico nenuE = new MenuEconomico("Econo 001", 4.00, 25.00);
        
        // 1 objeto de tipo MenuDia
        
        MenuDia menuD = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        
        // 1 objeto de tipo MenuCarta
        
        MenuCarta menuC = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10.00);
        
        // Anadimos los objetos a la lista
        
        lista.add(menuN1);
        lista.add(menuN2);
        lista.add(nenuE);
        lista.add(menuD);
        lista.add(menuC);
        
        for(int i = 0; i < lista.size();i++){
            
            lista.get(i).calcularValorMenu();
        
        }
        
        Cuenta cuenta = new Cuenta("René Elizalde",10.0,lista);
        
        cuenta.calcularSubtotal();
        cuenta.calcularValortotal();
        
        System.out.println(cuenta);
        
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/