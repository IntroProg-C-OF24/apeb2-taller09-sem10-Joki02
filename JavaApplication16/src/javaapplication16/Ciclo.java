package javaapplication16;

public class Ciclo {
    public static void main(String[] args) {
        double notas[] = new double[28];
        double promedioGe = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
            promedioGe += notas[i];
        }

        double notaAlta = notas[0];
        double notaBaja = notas[0];
        String nombreCalfAlta = "";
        String nombreCalfBaja = "";

        promedioGe = promedioGe / notas.length;
        System.out.printf("El promedio general es de: %.2f \n", +promedioGe);
        for (int i = 0; i < notas.length; i++) {
            double notaEstu = notas[i];

            if (notaEstu > promedioGe) {
                System.out.printf("Estudiante " + (i + 1) + " tiene nota por encima del promedio: %.2f \n", notaEstu);
            } else if (notaEstu < promedioGe) {
                System.out.printf("Estudiante " + (i + 1) + " tiene nota por debajo del promedio :  %.2f \n", notaEstu);
            }

            if (notaAlta < notaEstu) {
                notaAlta = notaEstu;
                nombreCalfAlta = "Estudiante " + (i + 1);
            }
            if (notaBaja > notaEstu) {
                notaBaja = notaEstu;
                nombreCalfBaja = "Estudiante " + (i + 1);
            }
        }

        System.out.println("------------");
        System.out.printf("El estudiante con al calificación más alta fue: " 
                + nombreCalfAlta + " con una nota de: %.2f \n", notaAlta);
        
        
        System.out.printf("El estudiante con al calificación más baja fue: " 
                + nombreCalfBaja + " con una nota de: %.2f \n", notaBaja);
    }
    
}
