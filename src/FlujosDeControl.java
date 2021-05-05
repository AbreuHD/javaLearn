import java.util.Scanner;
public class FlujosDeControl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Agrega un numero");
        int numeroCosas = sc.nextInt();

        if(numeroCosas < 6){

            System.out.println("No se me ocurre que poner");

        } else {System.out.println("Neftali es JOvenciTO");}

        switch(numeroCosas){
            case 1:
                System.out.println("nuc es 1");
                break;

            case 2:
                System.out.println("nuc 2");
                break;

            case 3:
                System.out.println("treh");
                break;

            default:
                System.out.println("mi mama me ama");
        }
    }
}
