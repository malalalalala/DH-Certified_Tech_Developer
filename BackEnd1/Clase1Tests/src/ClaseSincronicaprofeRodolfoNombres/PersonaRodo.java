package ClaseSincronicaprofeRodolfoNombres;

   public class PersonaRodo {
        private String nombre;
        private String apellido;
        private int edad;
        private String email;

        public boolean esNombreMayorIgual5Letras(){
            return cantidadLetrasDelNombre()>=5;
        }

        private int cantidadLetrasDelNombre() {
            return this.nombre.length();
        }

        public boolean esMayorDeEddad(){
            return edad>=18;
        }


        public PersonaRodo(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


    }

