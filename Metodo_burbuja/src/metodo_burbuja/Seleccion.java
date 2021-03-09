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
public class Seleccion {
    public Seleccion(){}
    int e[]=new int[15];
    String t="";
    int n = 15, mini;
    public double resul;
    public String Arreglo(){
        for(int i = 0; i<n ; i++){
            e[i] = (int) (Math.random()*100+0);
        }
        for (int i=0; i<n; i++){
            
            System.out.print(e[i]+" ");
        }
        return t;  

    }
    
    public String OrdenamientoSelec (){
        for(int i = 0; i< e.length-1; i++){
            mini = i; 
            for ( int j = i+1; j < e.length; j++){
                if(e[j] < e[mini]) {
                    mini = j; 
                }
            }
            int aux = e[i];
            e[i] = e[mini];
            e[mini] = aux;
        }
        for(int i = 0; i<e.length; i++){
            System.out.print(e[i]+" ");
        }
        
        return t;
    }
    
    public double TiempoSelec (){
        long inicio = System.nanoTime();
        for(int i = 0; i< e.length-1; i++){
            mini = i; 
            for ( int j = i+1; j < e.length; j++){
                if(e[j] < e[mini]) {
                    mini = j; 
                }
            }
            int aux = e[i];
            e[i] = e[mini];
            e[mini] = aux;
        }
        long fin = System.nanoTime();
        double dif = (double) (fin-inicio)* 1.0e-9;
        return dif;
    }
}
