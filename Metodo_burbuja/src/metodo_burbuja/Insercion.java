/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_burbuja;

/**
 *
 * @author User
 */
public class Insercion {
    public Insercion(){}
    int p [] = new int[15];
    String a="";
    int n = 15, aux, m;
    public String Arreglo (){
        for(int i = 0; i<n ;i++){
            p[i] = (int)(Math.random()*100+0);
            
        }
        for(int i=0; i<n;i++){
            System.out.print(p[i]+ " ");
        }
        return a;
    }
    
    public String OrdenamientoIn (){
        for(int i=0; i<n ; i++ ){
            m=i;
            aux=p[i];
            
            while ((m>0) && (p[m-1]>aux)){
                p [m] = p[m-1];
                m--;
            }
            p[m]=aux;
        }
        for(int i=0; i<n;i++){
            System.out.print(+p[i]+" ");
        }
        return a;
    }
    
    public double TiempoIn (){
        long inicio = System.nanoTime();
        for(int i=0; i<n ; i++ ){
            m=i;
            aux=p[i];
            
            while ((m>0) && (p[m-1]>aux)){
                p [m] = p[m-1];
                m--;
            }
            p[m]=aux;
        }
        long fin = System.nanoTime();
        double dif = (double) (fin-inicio) * 1.0e-9;
        return dif;

    }
}
