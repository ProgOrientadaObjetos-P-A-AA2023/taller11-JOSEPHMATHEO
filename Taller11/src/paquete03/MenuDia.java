package paquete03;

public class MenuDia extends Menu {
    
    private double valorPostre;
    private double valorBeb;
    
    public MenuDia(String np, double vM, double vInM,
            double vP, double vB){
    
    super(np, vM,vInM);
    
    valorPostre = vP;
    valorBeb = vB;
    
    }

    public void establecerValorPostre(double f) {
        
        valorPostre = f;
        
    }

    public void establecerValorBeb(double f) {
        
        valorBeb = f;
        
    }
    
    @Override
    
    public void calcularValorMenu(){
        
        valorMenu = valorPostre + valorBeb + valorInMenu;
                
    }

    public double obtenerValorPostre() {
        
        return valorPostre;
        
    }

    public double obtenerValorBeb() {
        
        return valorBeb;
        
    }
    
    @Override
    
    public String toString(){
    
        String cadena = String.format("Menu del Dia:");
        
        cadena = String.format("%s\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                +"\tValor de Postre: "
                + "\tValor de Bebida: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                cadena,
                nombrePlato,
                valorInMenu,
                valorPostre,
                valorBeb,
                valorMenu);
        
        return cadena;
        
    }
    
}
