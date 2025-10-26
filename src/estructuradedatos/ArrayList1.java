
package estructuradedatos;
import java.util.ArrayList;

public class ArrayList1 {
    
    public static void main(String[] args) {
    
        ArrayList<String> listaNombres= new ArrayList<>();
    
        listaNombres.add("Adrina");
        listaNombres.add("Bryan");
        listaNombres.add("Christian");
        
        for (String listaNombre : listaNombres) {
            
            System.out.println("Nombre : "+listaNombre);
            
        }
    }
    
}
