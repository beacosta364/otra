public abstract class Ciclista {
    private String nombre;
    private int edad;
    private double velocidad;

    // Constructor
    public Ciclista(String nombre, int edad, double velocidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.velocidad = velocidad;
    }

    public Ciclista(int identificador, String nombre2) {
        
    }
    public abstract String imprimirTipo();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("velocidad: " + velocidad);
    }

    public int getTiempoAcumulado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTiempoAcumulado'");
    }
}
 
























































/* 



public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado;
 
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }
 
    public int getIdentificador() {
        return identificador;
    }
 
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
 
    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
 
    public abstract String imprimirTipo();
 
    public void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo Acumulado: " + tiempoAcumulado);
    }
}
 */