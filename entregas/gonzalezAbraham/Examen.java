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

        int[] notas = new int[numAsignaturas];
        for (int i = 0; i < numAsignaturas; i++) {
            do {
                System.out.print("Ingrese la nota de la asignatura " + (i + 1) + ": ");
                notas[i] = Integer.parseInt(System.console().readLine());
                // pedir promedio
                promedio = notas[i] / 2;
                system.out.println("El promedio es: " + promedio);
            } while (notas[i] < 0 || notas[i] > 10);
            

        



  

        
        
         
    }
}