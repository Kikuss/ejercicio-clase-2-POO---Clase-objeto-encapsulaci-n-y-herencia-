public abstract class Persona {
    // nombres y apellidos se repetían en Catedratico y Estudiante,
    // por eso los "subimos" aquí (esto es abstraer datos repetidos)
    protected String nombres;
    protected String apellidos;
    protected String cuentaBancaria; // el "#" del diagrama = protected

    public Persona(String nombres, String apellidos, String cuentaBancaria) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuentaBancaria = cuentaBancaria;
    }

    // Método básico que las clases hijas van a completar
    public void mostrarInformacion() {
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
    }
}
