package javaapplication16;
import java.util.Scanner;
public class Estudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra en MAYÚSCULA");
            inicial = sc.nextLine();
            
            for(String estudianteActual : estudiantes){
                if(inicial.equalsIgnoreCase(estudianteActual.substring(0,1))){
                    bandera = false;
                    System.out.println("La letra coincidió");
                }
            }
        }
    }
    
}
