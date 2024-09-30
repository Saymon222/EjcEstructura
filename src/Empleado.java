public class Empleado {

    protected String cedula;
    protected String nombre;
    protected Double Salario;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, Double salario, String departamento) {
        this.cedula = cedula;
        this.nombre = nombre;
        Salario = salario;
    }



    public String getCc() {
        return cedula;
    }

    public void setCc(String cc) {
        this.cedula = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public void mostrarDetalles(){

        System.out.println("Cedula"+ cedula + "Nombre "+ nombre+ "Salario"+ Salario);



    }
    public double calcularBonificación(){
      return 0;
    }
}
