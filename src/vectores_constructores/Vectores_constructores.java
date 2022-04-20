/*Crear un proyecto que mediante métodos lea un vector de notas de tamaño N y 
luego imprima:
-	La mejor nota (suponer solo una)
-	El promedio de notas
-	El porcentaje de personas que perdieron en relación a todo el grupo */
package vectores_constructores;
import java.util.Scanner;

public class Vectores_constructores {

    public static void main(String[] args) {
        // Definir objetos y variables
        Scanner objleer=new Scanner(System.in);
        float mayor,prom,por_perdieron;
        int n;
        
        //Leer el tamaño del vector y lo voy a definir
        System.out.print("¿Cuantos elementos tiene el vector? ");
        n=objleer.nextInt();
        ClsVector objvector=new ClsVector(n);
        float[] notas=new float[n];
        
        //Leer e imprimir el vector
        notas=objvector.Leer_vector_notas();
        ClsVector objvector1=new ClsVector(n,notas);
        objvector1.Imprimir_vector_notas();
        
        //Operaciones sobre el vector
        mayor=objvector1.Hallar_mayor_nota();
        prom=objvector1.Hallar_promedio_notas();
        por_perdieron=objvector1.Hallar_porcentaje_perdedores();
        System.out.println("\n\nLa mayor nota es " + mayor);
        System.out.println("El promedio de notas es " + prom);
        System.out.println("El porcentaje de los que perdieron es "+ por_perdieron);
    }
}
