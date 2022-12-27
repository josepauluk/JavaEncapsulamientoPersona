public class encapsulacionPersona {
        private int edad;  // variable privada para almacenar la edad de la persona
        private String nombre;  // variable privada para almacenar el nombre de la persona
        private int telefono;  // variable privada para almacenar el teléfono de la persona

        // método get para obtener la edad de la persona
        public int getEdad() {
            return edad;
        }

        // método set para establecer la edad de la persona
        public void setEdad(int edad) {
            this.edad = edad;
        }

        // método get para obtener el nombre de la persona
        public String getNombre() {
            return nombre;
        }

        // método set para establecer el nombre de la persona
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        // método get para obtener el teléfono de la persona
        public int getTelefono() {
            return telefono;
        }

        // método set para establecer el teléfono de la persona
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
}

