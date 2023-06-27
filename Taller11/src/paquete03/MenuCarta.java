package paquete03;


public class MenuCarta extends Menu{
    
    private double valorPguarnicion;
    private double valorBeb;
    private double porAddMenu;
    
    public MenuCarta(String np, double vM, double vInM,
            double valPg, double valB, double porMe){
        
        super(np, vM, vInM);
    
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
        
        valorMenu = valorPguarnicion + valorBeb + porAddMenu + 
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
                +"\tValor de porción de guarnición: "
                + "\tValor de Bebida: %.2f\n"
                + "\tPorcentaje adicional por servicio: "
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
