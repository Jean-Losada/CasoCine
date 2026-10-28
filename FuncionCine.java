
package funcion;

public class FuncionCine {
    
    private String sala;
    private String tituloPelicula;
    private int asientosOcupados;
    private double recaudacion;
    
public static final double TARIFA_BASE = 12000.0;

public FuncionCine(){}

public FuncionCine(String tituloPelicula, String sala, int asientosOcupados) {

    setTituloPelicula(tituloPelicula);
    setSala(sala);
    setAsientosOcupados(asientosOcupados);
    calcularRecaudacion();

}

public String getTituloPelicula() {
        return tituloPelicula;

}

public void setTituloPelicula(String tituloPelicula) {
        if (tituloPelicula != null && !tituloPelicula.trim().isEmpty()) {
            this.tituloPelicula = tituloPelicula;
        } else {
            System.out.println("Error: El titulo de la pelicula no puede estar vacio.");
        }
}

public String getSala() {
    return sala;
}

public void setSala(String sala) {
    this.sala = sala;
}

public int getAsientosOcupados() {
    return asientosOcupados;
}

public void setAsientosOcupados(int asientosOcupados) {
    if (asientosOcupados >= 0) {
    this.asientosOcupados = asientosOcupados;
            calcularRecaudacion();
        } else {
            System.out.println("Error: Los asientos ocupados no pueden ser negativos.");
        }
    }

public double getRecaudacion() {
    return recaudacion;

}

public void calcularRecaudacion() {
    this.recaudacion = this.asientosOcupados * TARIFA_BASE;
   
}

public void mostrarDetalles() {
        
    System.out.println("Pelicula: " + tituloPelicula);
    System.out.println("Sala: " + sala);
    System.out.println("Asientos Ocupados: " + asientosOcupados);
    System.out.println("Recaudacion Total: $" + recaudacion + " COP");
    
}

}
