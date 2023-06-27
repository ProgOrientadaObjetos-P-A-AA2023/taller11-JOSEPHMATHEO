package paquete03;


public class MenuCarta extends Menu{
    
    private double valorPguarnicion;
    private double valorBeb;
    private double porAddMenu;
    
    public MenuCarta(String np, double vInM,
            double valPg, double valB, double porMe){
        
        super(np, vInM);
    
        valorPguarnicion = valPg;
        valorBeb = valB;
        porAddMenu = porMe;
    
    }

    public void establecerValorPguarnicion(double f) {
        
        valorPguarnicion = f;
        
    }

    public void establecerValorBeb(double f) {
        
        valorBeb = f;
        
    }

    public void establecerPorAddMenu(double f) {
        
        porAddMenu = f;
        
    }
    
    @Override
    
    public void calcularValorMenu(){
        
        valorMenu = valorInMenu + valorPguarnicion + valorBeb + 
                (valorInMenu * (porAddMenu / 100));
                
    }

    public double obtenerValorPguarnicion() {
        
        return valorPguarnicion;
        
    }

    public double obtenerValorBeb() {
        
        return valorBeb;
        
    }

    public double obtenerPorAddMenu() {
        
        return porAddMenu;
        
    }
    
    @Override
    
    public String toString(){
    
        String cadena = String.format("Menu a la Carta:");
        
        cadena = String.format("%s\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                +"\tValor de porción de guarnición: %.2f\n"
                + "\tValor de Bebida: %.2f\n"
                + "\tPorcentaje adicional por servicio: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                cadena,
                nombrePlato,
                valorInMenu,
                valorPguarnicion,
                valorBeb,
                porAddMenu,
                valorMenu);
        
        return cadena;
        
    }
    
    
}
