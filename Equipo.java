import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private static int tiempoTotal;
    private String pais;
    private ArrayList <Ciclista> ciclistas;
 
    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }
 
    public void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        tiempoTotal += ciclista.getTiempoAcumulado();
    }
 
    public void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total: " + tiempoTotal);
        for (Ciclista ciclista : ciclistas) {
            ciclista.imprimirDatos();
        }
    }
}