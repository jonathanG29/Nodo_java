package Ejercicio1.abstracto;

    public abstract class Asalariado extends Persona {

        private String departamento;
        private int fechaIngreso;
        private float porcBono;

        public Asalariado() {
        }

        public Asalariado(int id, String nombre, String apellidos, double sueldo, String departamento, int fechaIngreso, float porcBono) {
            super(id, nombre, apellidos, sueldo);
            this.departamento = departamento;
            this.fechaIngreso = fechaIngreso;
            this.porcBono = porcBono;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public int getFechaIngreso() {
            return fechaIngreso;
        }

        public void setFechaIngreso(int fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
        }

        public float getPorcBono() {
            return porcBono;
        }

        public void setPorcBono(float porcBono) {
            this.porcBono = porcBono;
        }

        @Override
        protected void calculateBono() {

        }

    }

