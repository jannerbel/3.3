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
public class Burbuja {
    public Burbuja (){}
    int a[] = new int [15]; 
     int n = 15, aux;
     String p ="";
    public String Arreglo (){
 
        for(int i = 0; i<n ;i++){
            a[i] = (int)(Math.random()*100+0);
            
        }
        for(int i=0; i<n;i++){
            System.out.print(a[i]+ " ");
        }
        return p;
    }
    
    public String Ordenamiento (){
     
        for(int i = 0; i<n-1 ; i++){
            for (int j = 0; j<n-1;j++){
                if(a[j] > a[j+1]){
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
            
        }
         for(int i=0; i<n;i++){
            System.out.print(a[i]+ " ");
        }
        return p;
        
    }
    public double Tiempo(){
        long inicio = System.nanoTime();
        for(int i = 0; i<n-1 ; i++){
            for (int j = 0; j<n-1;j++){
                if(a[j] > a[j+1]){
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
            
        }
        long fin = System.nanoTime();
        double dif = (double) (fin-inicio)*1.0e-9;
        return dif;
    }
    
}
