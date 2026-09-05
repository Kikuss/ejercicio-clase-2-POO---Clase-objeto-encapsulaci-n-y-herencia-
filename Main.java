public class Main {
    public static void main(String[] args) {
        // Creamos 2 catedraticos con su constructor
        Catedratico catedratico1 = new Catedratico("Ana", "López", "1234-5678", 6500.00);
        Catedratico catedratico2 = new Catedratico("Carlos", "Ramírez", "8765-4321", 7200.00);

        // Creamos 2 estudiantes con su constructor
        Estudiante estudiante1 = new Estudiante("María", "Gómez", "1111-2222", 45);
        Estudiante estudiante2 = new Estudiante("Luis", "Pérez", "3333-4444", 60);

        System.out.println("=== CATEDRATICOS ===");
        catedratico1.mostrarInformacion();
        catedratico2.mostrarInformacion();

        System.out.println("=== ESTUDIANTES ===");
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}
