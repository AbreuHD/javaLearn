import java.util.Scanner;
public class BuclesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cant = sc.nextInt();
        System.out.println("cuantos numeros piensas agregar?");
        int[] ggbro = new int[sc.nextInt()];

        for(int i = 0 ; i < ggbro.length ; i++){
            System.out.println("añade el " + (i+1) + " numero");
            ggbro[i] = sc.nextInt();
            System.out.println("ggbro[i] = " + ggbro[i]);
        }

    }
}
