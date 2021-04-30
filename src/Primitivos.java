public class Primitivos {
    public static void main(String[] args){

//      Tipos de datos primitivos

        byte numeroByte = 127; //max 127 / min -128
        System.out.println("numeroByte = " + numeroByte);

        short numShort = 32767; //max 32767 / min -32768
        System.out.println("numShort = " + numShort);

        int numEntero = 2147483647;
        System.out.println(numEntero); //2 billones idk

        long numLong = 9223372036854775807L;
        System.out.println("numLong = " + numLong);
        System.out.println("tipo long max " + Long.MAX_VALUE);
        System.out.println("tipo long min " + Long.MIN_VALUE);
        
    }
}
