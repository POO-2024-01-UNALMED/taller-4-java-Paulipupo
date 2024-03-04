package classroom;

public class Persona {

    final long cedula;
    private String nombre;
    private static int totalPersonas;
    
    static {
        totalPersonas = 0;
        /*cedula = 3;  /* No se puede escribir aquí cédula porque es un atributo de instancia y final */
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        Persona.totalPersonas++; /* Llamar desde la clase */
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        Persona.totalPersonas++; /* Llamar desde la clase */
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        Persona.totalPersonas++; /* Llamar desde la clase */
    }

    public Persona(String nombre) {
        this.nombre = nombre; /* Asignar el valor de nombre al atributo nombre */
        this.cedula = 1; /* cedula = 0 */
        Persona.totalPersonas++; /* Llamar desde la clase */
    }
    
    public Persona() {  /*Crear constructor vacío y asignar valores vacios */
        this(0,"");
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
