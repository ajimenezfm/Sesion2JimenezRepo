
package estructurascontroliteractivas;

public class EstructuraIterativas {
    
    //estructura de control for imprimir abecedario
    public void IterativaFor(){
        
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            System.out.println("letra: "+letra);
        }
        
    }
    
    //Arreglo permite almacenas millones de valores 
    
    public void estructuraForEach(){
        
        int arregloNumeros[]={3,2,100,500,1};//indexacion es comenzar a contar desde cero en su primer posicion
        for (int arregloNumero : arregloNumeros) {
            
            System.out.println("Cantidad arreglo es :"+arregloNumero);
        }
        
        
    }
    
    public void estructuraWhile(){
        
        int contador=1; 
        while (contador <= 5) {            
            System.out.println("Numero es copn While: "+contador);
            contador ++;
        }
    }
    

}
