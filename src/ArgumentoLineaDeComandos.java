public class ArgumentoLineaDeComandos {
    public static void main(String[] args){

        if(args.length == 0 ){
            System.out.println("Debe entrar algun argumento");
            System.exit(-1);
        }

        for(int i = 0 ; i < args.length; i++ ){

            System.out.println("Argumento n. " + i + " = " + args[i]);

        }
    }
}
