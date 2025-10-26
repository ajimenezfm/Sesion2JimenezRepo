
package vista;
import estructurascontrolselectivas.EstructurasSelectivas;
import estructurascontroliteractivas.EstructuraIterativas;
import java.util.Scanner;

public class Test {//inicia clase
    
    public static void menuGeneral(){
        int menu; //variable global tiene alcance en todos los metodos y estructuras de control
        
        
        do {            
            
        
        System.out.println("Menu Estructurad de control Jimenez"
                + " \nSlecciona"
                + "\n1.Selectivas"
                + "\n2.Iteractivas"
                + "\n3.Salir");
        Scanner entradaMenu = new Scanner (System.in);
        menu=entradaMenu.nextInt();
        
        switch (menu) {
            
            case 1:
            //llamada del metodo
            EstructurasSelectivas a=new EstructurasSelectivas();
            a.selectivaIf();
            a.selectivasSwitch();    
                    break;
            
            
            case 2:
            EstructuraIterativas b= new EstructuraIterativas();
            b.IterativaFor();
            b.estructuraForEach();
            b.estructuraWhile();
                break;
            
            case 3:System.out.println("Finalizo el programa ");break;    
            default:System.out.println("Opcion invalida solo tengo de 1 al 3!");break;
        }
        
        } while (menu!=3);
        
    }
    public static void main(String[] args) {//inicia main para llamar metodos-ejecutar
        
        menuGeneral();
       
        
  
        
        
    }
    
}
