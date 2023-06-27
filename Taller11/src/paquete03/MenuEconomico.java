package paquete03;

public class MenuEconomico extends Menu{
    
    private double porcentajeDesucento;
    
    public MenuEconomico(String np, double vM, double vInM,
            double pD){
    
    super(np, vM, vInM);
    
    porcentajeDesucento = pD;
    
    }

    public void establecerPorcentajeDesucento(double f) {
        
        porcentajeDesucento = f;
        
    }
    
    @Override
    
    public void calcularValorMenu(){
        
        valorMenu = valorInMenu + (valorInMenu * (porcentajeDesucento/100) );
                
    }

    public double obtenerPorcentajeDesucento() {
        
        return porcentajeDesucento;
        
    }
    
}
