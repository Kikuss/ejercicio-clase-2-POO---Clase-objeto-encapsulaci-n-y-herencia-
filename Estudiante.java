public class Estudiante extends Persona {
    private int creditosObtenidos;

    public Estudiante(String nombres, String apellidos, String cuentaBancaria, int creditosObtenidos) {
        super(nombres, apellidos, cuentaBancaria);
        this.creditosObtenidos = creditosObtenidos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Créditos obtenidos: " + creditosObtenidos);
        System.out.println("-------------------------");
    }
}
