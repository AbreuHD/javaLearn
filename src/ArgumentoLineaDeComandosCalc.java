public class ArgumentoLineaDeComandosCalc {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Por favor solo agregar una operacion (suma,resta, multiplicacion o division) y 2 numeros :D");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado;

        switch (operacion){
            case "suma":
                System.out.println("La suma es " + a+b);
                break;
            case "resta":
                System.out.println("La resta es " + (a-b));
                break;
            case "multiplicacion":
                System.out.println("La Multiplicacion es " + a*b);
                break;
            case "division":
                if(b == 0){
                    System.out.println("No se puede dividir entre 0");
                    System.exit(-1);
                }
                System.out.println("La division es " + a/b);
                break;
            default:
                System.out.println("Solo hacemos multiplicacion, division, suma o resta.");
        }
    }
}
