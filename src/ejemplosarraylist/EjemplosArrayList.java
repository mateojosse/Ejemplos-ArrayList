package ejemplosarraylist;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Mateo
 */
public class EjemplosArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList(Arrays.asList("A","B","C","D","E","F"));
        lista.forEach(elementos ->{
        System.out.println("Valor de la lista "+elementos);
        if(elementos.equals("D")){
            System.out.println("Se encontro la cadena");
        }
        });
        lista.add("G");
        lista.add("H");
        System.out.println("\n\n Otra forma de recorrer la lista \n");
        for (String contenido : lista){
            System.out.println("Valor de lista"+contenido);
        }
        lista.add("I");
        lista.add("J");
        lista.add("K");
        String variable ="L";
        lista.add(variable);
        System.out.println("\n\n Otra forma de recorrer la lista \n");
        lista.stream().forEach((contiene)->{
     mensaje(contiene);      
    });
    }
public static void mensaje (String valor){
    System.out.println("Contiene "+valor);
}
}
