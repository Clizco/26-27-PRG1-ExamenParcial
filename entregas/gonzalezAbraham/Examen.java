public class Examen {
    public static void main(String[] args) {
        int numAsignaturas = 0;
        do {
            System.out.print("Ingrese el número de asignaturas: ");
            numAsignaturas = Integer.parseInt(System.console().readLine());
            if (numAsignaturas < 1 || numAsignaturas > 10) {
                System.out.println("El número de asignaturas debe estar entre 1 y 10.");
            }
        } while (numAsignaturas < 1 || numAsignaturas > 10);
        



  

        
        
         
    }
}