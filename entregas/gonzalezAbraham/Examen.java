public class Examen {
    public static void main(String[] args) {
        // Pedir edad valida entre 16 y 99
        int edad = 0;
        while (edad < 16 || edad > 99) {
            System.out.print("Ingrese su edad (entre 16 y 99): ");
            edad = Integer.parseInt(System.console().readLine());
            if (edad < 16 || edad > 99) {
                System.out.println("Edad invalida. Intente de nuevo.");
            }
        }
        
        
         
    }
}