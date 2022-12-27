public class Main {

    public static void main(String[] args) {
        // crea una nueva instancia de la clase Persona
        encapsulacionPersona persona = new encapsulacionPersona();

        // establece la edad, nombre y teléfono de la persona utilizando los métodos set
        persona.setEdad(30);
        persona.setNombre("Juan");
        persona.setTelefono(774579879);

        // muestra la edad, nombre y teléfono de la persona utilizando los métodos get
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
