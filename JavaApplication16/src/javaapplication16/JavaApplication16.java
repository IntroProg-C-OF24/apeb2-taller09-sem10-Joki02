package javaapplication16;
public class JavaApplication16 {

    public static void main(String[] args) {
        int[] arregloNum = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int sumaArreglo = 0;

        for(int numero : arregloNum)
            sumaArreglo += numero;    
        
        int promedio = sumaArreglo / arregloNum.length;
        
        int numerosMayores = 0;
        int numerosMenores = 0;
         
        for(int numero : arregloNum){
             
             if(numero > promedio){
                 System.out.println(numero + " está por encima de la media");
                 numerosMayores++;
                 continue;
                }
                 
             if(numero < promedio){
                 System.out.println(numero + " está por debajo de la media");
                 numerosMenores++;
                 continue;
                }
             
             System.out.println(numero + " es igual al promedio");
        }
         
         System.out.println("Los numeros mayores a la media son: " + numerosMayores);
         System.out.println("Los números menores a la media son: " + numerosMenores);
    }
    
}
