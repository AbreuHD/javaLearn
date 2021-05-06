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

        for (int ia = 0 ; ia < (frase.length() * frase.length()) ; ia++){
            for (int i = 0 ; i < arrSearch.length ; i++) {
                for (int idk = 0 ; idk < frase.length() ; idk++){
                    if(arrFrase[idk] == arrSearch[i]){
                        System.out.println(idk + " y " + i + " Son iguales");
                    }
                }
            }
        }



    }
}
