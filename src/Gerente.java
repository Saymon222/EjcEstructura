public class Gerente extends Empleado {

    private String departamento;

    public Gerente() {
    }

    public Gerente(String cedula, String nombre, Double salario, String departamento) {
        super(cedula, nombre, salario,departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }

    @Override
    public void mostrarDetalles(){

    }
    @Override
    public double calcularBonificación(){

        return Salario;
    }
}
