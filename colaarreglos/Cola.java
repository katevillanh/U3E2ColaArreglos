package colaarreglos;
import java.util.Scanner;

public class Cola {
    Scanner entrada = new Scanner(System.in);
    String pila[]= new String [5];
    int frente=-1;
    int fina=0;
    
    public int insertar(){
        if(fina<5){
            System.out.println("Palabra a insertar:");
            pila[fina]=entrada.next(); 
            fina++;
        }else{
            System.out.println("No hay espacio"); 
            
        }
        return fina;
    }
    
    public void mostrar(){
        if(fina==0){
            System.out.println("No hay datos");
        }else{
            System.out.println("Datos de la cola:");
            for(int i=0;i<pila.length;i++)
            System.out.println(pila[i]);
        }
    }
    
    public int eliminar(){
        if(fina==0){
            System.out.println("No hay datos");
        }else{
            frente++;
            pila[frente]=null;
            
        }
        return frente;
    }
}
