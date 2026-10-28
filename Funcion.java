
package funcion;

public class Funcion {

public static void main(String[] args) {
    
    System.out.println("=== PRUEBA DE SISTEMA DE GESTION DE CINE ==-\n"); 
        
System.out.println("1. Registrando Funcion Normal:");
    FuncionNormal funcion1 = new FuncionNormal("Intensa-Mente 2", "Sala 3", 50);
    funcion1.mostrarDetalles();
    
System.out.println("\n----------------------------------\n");

System.out.println("2. Registrando Funcion de Estreno:");
    FuncionEstreno funcion2 = new FuncionEstreno("Avengers: Secret Wars", "Sala IMAX 1", 30, 5000.0);
    funcion2.mostrarDetalles();
    
System.out.println("\n----------------------------------\n");
System.out.println("3. Probando validaciones de errores:");
    funcion1.setAsientosOcupados(-10); 
    }

}
    