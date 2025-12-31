package es.usal;

/**
 * Representa una persona con nombre, apellido, edad y email.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    /**
     * Crea una nueva instancia de Persona.
     *
     * @param nombre   Nombre de la persona
     * @param apellido Apellido de la persona
     * @param edad     Edad de la persona
     * @param email    Correo electrónico de la persona
     */
    public Persona(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre de la persona
     */
    public String getNombre() { 
        return nombre; 
    }

    /**
     * Devuelve el apellido de la persona.
     *
     * @return apellido de la persona
     */
    public String getApellido() { 
        return apellido; 
    }

    /**
     * Devuelve la edad de la persona.
     *
     * @return edad de la persona
     */
    public int getEdad() { 
        return edad; 
    }

    /**
     * Devuelve el email de la persona.
     *
     * @return email de la persona
     */
    public String getEmail() { 
        return email; 
    }
    
        /**
     * Crea una instancia de Persona a partir de un String con formato:
     * "nombre,apellido,edad,email".
     *
     * @param input cadena de entrada
     * @return una instancia de Persona
     * @throws IllegalArgumentException si el input es null o el formato es inválido
     */
    public static Persona fromString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("El input no puede ser null");
        }

        String[] partes = input.split(",");
        if (partes.length != 4) {
            throw new IllegalArgumentException("Formato inválido, se esperaban 4 campos");
        }

        String nombre = partes[0].trim();
        String apellido = partes[1].trim();
        int edad;

        try {
            edad = Integer.parseInt(partes[2].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Edad inválida");
        }

        String email = partes[3].trim();
        return new Persona(nombre, apellido, edad, email);
    }

}