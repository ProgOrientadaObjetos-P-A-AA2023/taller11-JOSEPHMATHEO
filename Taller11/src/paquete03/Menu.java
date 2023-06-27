package paquete03;

public abstract class Menu {
    
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInMenu;
    
    
    public Menu(String np, double vM, double vInM){
    
        nombrePlato = np;
        valorMenu = vM;
        valorInMenu = vInM;
        
    }

    public void establecerNombrePlato(String s){
        
        nombrePlato = s;
        
    }

    public abstract void calcularValorMenu();

    public void establecerValorInMenu(double f){
        
        valorInMenu = f;
        
    }

    public String obtenerNombrePlato() {
        
        return nombrePlato;
        
    }

    public double obtenerValorMenu() {
        
        return valorMenu;
        
    }
    
    public double obtenerValorInMenu() {
        
        return valorInMenu;
        
    }
    
    
    
    
    
    
}
