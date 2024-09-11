package Ejercicio1.abstracto;

    public abstract class Asalariado extends Persona {

        private String departamento;
        private int fechaIngreso;
        private double porcBono;

        public Asalariado() {
        }

        public Asalariado(int id, String nombre, String apellidos, double sueldo, String departamento, int fechaIngreso, double porcBono) {
            super(id, nombre, apellidos, sueldo);
            this.departamento = departamento;
            this.fechaIngreso = fechaIngreso;
        }

        public int getFechaIngreso() {
            return fechaIngreso;
        }

        public void setFechaIngreso(int fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public double getPorcBono() {
            return porcBono;
        }

        public void setPorcBono(double porcBono) {
            this.porcBono = porcBono;
        }


        @Override
        protected void calculateBono() {

        }

    }

