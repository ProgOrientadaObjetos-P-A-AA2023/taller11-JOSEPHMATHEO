package paquete03;

public class MenuEconomico extends Menu{
    
    private double porcentajeDesucento;
    
    public MenuEconomico(String np, double vInM,
            double pD){
    
    super(np, vInM);
    
    porcentajeDesucento = pD;
    
    }

    public void establecerPorcentajeDesucento(double f) {
        
        porcentajeDesucento = f;
        
    }
    
    @Override
    
    public void calcularValorMenu(){
        
        valorMenu = valorInMenu - (valorInMenu * (porcentajeDesucento/100) );
                
    }

    public double obtenerPorcentajeDesucento() {
        
        return porcentajeDesucento;
        
    }
    
    @Override
    
    public String toString(){
    
        String cadena = String.format("Menu Econocmico:");
        
        cadena = String.format("%s\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tPorcentaje de descuento: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                cadena,
                nombrePlato,
                valorInMenu,
                porcentajeDesucento,
                valorMenu);
        
        return cadena;
        
    }
    
}
