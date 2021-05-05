// Codigo no terminado no dejan de llamarme idk
import java.util.Scanner;
public class BuscarPalabrasEnUnString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta tu frase");
        String frase = sc.nextLine();
        System.out.println("Que palabra deseas buscar?");
        String searchFrase = sc.nextLine();


        char[] arrFrase = frase.toCharArray();
        char[] arrSearch = searchFrase.toCharArray();

        for (int ia = 0 ; ia < frase.length() ; ia++){
            for (int i = 0 ; i < arrSearch.length ; i++) {
                if(arrFrase[ia] == arrSearch[i]){
                    System.out.println(ia + " y " + i + " Son iguales");
                }
            }
        }



    }
}
