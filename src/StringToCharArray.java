public class StringToCharArray {
    public static void main(String[] args){
        String gg = "no se que poner";

        char[] arregloGg = gg.toCharArray();
        for(int i= 0 ; i < arregloGg.length ; i++){
            System.out.print(arregloGg[i]);
        }
        System.out.println("gg.split(\"a\") = " + gg.split("a"));

        String[] arr2 = gg.split("o");
        for(int j=0 ; j < arr2.length  ; j++){

            System.out.println(arr2[j]);
        }
    }
}
