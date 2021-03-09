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
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Burbuja ordenamiento1 = new Burbuja();
        System.out.println(" Arreglo con numeros aleatoreos sin ordenar "+ordenamiento1.Arreglo()+"");
        System.out.println(" Arreglo ordenado con el metodo de burbuja "+ordenamiento1.Ordenamiento());
        System.out.println("Tiempo que se tarda el metodo bubuja: "+ordenamiento1.Tiempo()+ " segundos");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Insercion ordenamiento2 = new Insercion();
        System.out.println("Arreglo con numeros aleatoreos sin ordenar:"+ordenamiento2.Arreglo());
        System.out.println("Arreglo ordenado con el metodo de burbuja "+ordenamiento2.OrdenamientoIn());
        System.out.println("El tiempo que se tarda el metodo de insercin: "+ordenamiento2.TiempoIn());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Seleccion ordenamiento3 = new Seleccion();
        System.out.println("Arreglo con numeros aleatoreos son ordenar: "+ordenamiento3.Arreglo());
        System.out.println("Arreglo ordenado con el metodo de seleccion: "+ordenamiento3.OrdenamientoSelec());
        System.out.println("El tiempo que se tarda el metodo de seleccion: "+ordenamiento3.TiempoSelec());
        
    }
    
    
    
}
