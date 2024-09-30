public class Desarrollador extends Empleado{

    private String lenguaje;

    public Desarrollador() {

    }

    public Desarrollador(String cedula, String nombre, Double salario, String lenguaje) {
        super(cedula, nombre, salario, lenguaje);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "lenguaje='" + lenguaje + '\'' +
                '}';
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Cedula "+ cedula + "Nombre "+ nombre+ "Salario "+ Salario);
    }
    @Override
    public double calcularBonificación(){

        return 0;
    }
}
