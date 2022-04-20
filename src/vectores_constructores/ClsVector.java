/* Metodos para leer, imprimir, hallar la mejor nota, hallar promedio de
notas, porcentaje de los que perdieron, ademas se deben colocar los
constructores necesarios */
package vectores_constructores;
import java.util.Random;

public class ClsVector {
    private int n;
    private float[] notas;

    public ClsVector(int n) {
        this.n = n;
    }

    public ClsVector(int n, float[] notas) {
        this.n = n;
        this.notas = notas;
    }
    
    public float[] Leer_vector_notas(){
        Random rnd=new Random();
        float[] notas=new float[n];
        for (int i = 0; i < n; i++) {
            notas[i]=(float)rnd.nextInt(51)/10;
        }
        return notas;
    }
    
    public void Imprimir_vector_notas(){
        System.out.println("\n\n\t Notas");
        for (int i = 0; i < n; i++) {
            System.out.print(notas[i] + "   ");
        }
    }
    
    public float Hallar_mayor_nota(){
        float nota_mayor=notas[0];
        for (int i = 1; i < n; i++) {
            if (notas[i] > nota_mayor)
                nota_mayor=notas[i];
        }
        return nota_mayor;
    }
    
    public float Hallar_promedio_notas(){
        float prom_notas,acum_notas=0;
        for (int i = 0; i < n; i++) {
            acum_notas+=notas[i];
        }
        prom_notas=acum_notas/n;
        return prom_notas;
    }
    
    public float Hallar_porcentaje_perdedores(){
        float porcentaje,contador_perder=0;
        for (int i = 0; i < n; i++) {
            if (notas[i] < 3)
                contador_perder++;
        }
        porcentaje=contador_perder/n * 100;
        return porcentaje;
    }
}
