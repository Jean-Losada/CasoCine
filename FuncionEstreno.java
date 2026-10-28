
package funcion;

public class FuncionEstreno extends FuncionCine {
    
    private double recargoEstreno;
    
public FuncionEstreno(String tituloPelicula, String sala, int asientosOcupados, double recargoEstreno) {
    super(tituloPelicula, sala, asientosOcupados);
    this.recargoEstreno = recargoEstreno;
    calcularRecaudacion();
    
}

public double getRecargoEstreno() {
    return recargoEstreno;

}

public void setRecargoEstreno(double recargoEstreno) {
        this.recargoEstreno = recargoEstreno;
        calcularRecaudacion();

}

public void calcularRecaudacion() {
    super.calcularRecaudacion(); 
    double totalRecargo = getAsientosOcupados() * recargoEstreno;
    
}

public void mostrarDetalles() {
    
    double recaudacionTotalEstreno = getAsientosOcupados() * (TARIFA_BASE + recargoEstreno);
    System.out.println("--- FUNCION DE ESTRENO ---");
    System.out.println("Pelicula: " + getTituloPelicula());
    System.out.println("Sala: " + getSala());
    System.out.println("Asientos Ocupados: " + getAsientosOcupados());
    System.out.println("Recargo por Estreno (c/u): $" + recargoEstreno);
    System.out.println("Recaudacion Total: $" + recaudacionTotalEstreno + " COP");
    
}

}
