package javaapplication16;
import java.util.Scanner;
public class Marcas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de marcas a registrar: ");
        int numVehiculos = sc.nextInt();
        sc.nextLine();
        
        String vehiculosArray[] = new String[numVehiculos];
        String marcaVehiculoActual = "";
        for (int i = 0; i < vehiculosArray.length; i++) {
            System.out.println("Ingrese el nombre de la marca del auto" + (i + 1));
            marcaVehiculoActual = sc.nextLine();

            if (marcaVehiculoActual.startsWith("A")
                    || marcaVehiculoActual.startsWith("C")
                    || marcaVehiculoActual.startsWith("T")) {
                System.out.println("Marca no permitida, ingrese otra");
                i--;
                continue;
            }
              vehiculosArray[i] = marcaVehiculoActual;
        }
        
        for(String marcaVehiculo : vehiculosArray){
            System.out.println("Marca: " + marcaVehiculo);
        }
    }    
}
