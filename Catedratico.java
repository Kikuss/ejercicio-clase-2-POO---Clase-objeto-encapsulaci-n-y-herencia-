public class Catedratico extends Persona {
    private double sueldo; // dato privado, solo de Catedratico

    public Catedratico(String nombres, String apellidos, String cuentaBancaria, double sueldo) {
        super(nombres, apellidos, cuentaBancaria); // llama al constructor de Persona
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // imprime nombres y apellidos
        System.out.println("Sueldo: Q" + sueldo);
        System.out.println("-------------------------");
    }
}
