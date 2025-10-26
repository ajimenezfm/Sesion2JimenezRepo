package estructurascontrolselectivas;


public class EstructurasSelectivas {
    
    //funcion para conocer la estructura de control selectiva if
    public void selectivaIf(){
        
        //declaracionde variable double decimal
        
        double calificacion=5;
        
        if (calificacion >= 6.0) {//condicion verdadera
            
            System.out.println("Aprobado tienes calificacion : "+calificacion);
            
        } else {
            
            System.out.println("Reprobado tienes calificacion : "+calificacion);
        }
    }
    
    public void selectivasSwitch(){
        
        int dia=9;
        switch (dia) {
            case 1:System.out.println("Seleciona 1. Dia Lunes");break;
            case 2:System.out.println("Seleciona 1. Dia Lunes");break;
            case 3:System.out.println("Seleciona 1. Dia Lunes");break;
            case 4:System.out.println("Seleciona 1. Dia Lunes");break;
            case 5:System.out.println("Seleciona 1. Dia Lunes");break;
            default:System.out.println("Opcion invalida tengo 1,2,3,4,5");break;
            
        };
    }
}
