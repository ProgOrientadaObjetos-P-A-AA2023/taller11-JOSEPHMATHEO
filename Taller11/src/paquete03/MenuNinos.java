package paquete03;

public class MenuNinos extends Menu{
    
    private double valorPorHelado;
    private double valorPorPastel;
    
    public MenuNinos(String np, double vInM,
            double vph, double vpp){
    
    super(np, vInM);
    
    valorPorHelado = vph;
    valorPorPastel = vpp;
    
    }

    public void establecerValorPorHelado(double f) {
        
        valorPorHelado = f;
        
    }

    public void establecerValorPorPastel(double f) {
        
        valorPorPastel = f;
        
    }
    
    @Override
    
    public void calcularValorMenu(){
        
        valorMenu = valorPorHelado + valorPorPastel + valorInMenu;
                
    }

    public double obtenerValorPorHelado() {
        
        return valorPorHelado;
        
    }

    public double obtenerValorPorPastel() {
        
        return valorPorPastel;
        
    }
    
    @Override
    
    public String toString(){
    
        String cadena = String.format("Menu de ninos:");
        
        cadena = String.format("%s\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor de porcion de helado: %.2f\n"
                + "\tValor de porción de pastel: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                cadena,
                nombrePlato,
                valorInMenu,
                valorPorHelado,
                valorPorPastel,
                valorMenu);
        
        return cadena;
        
    }
    
}
