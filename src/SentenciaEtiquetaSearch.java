public class SentenciaEtiquetaSearch {
    public static void main(String[] args) {
        String trabaIdk = "tres tristes trigres tragaban trigo en un trigal";
        int cantidad12 = 0;
        for(int i = 0 ; i < trabaIdk.length() ; i++ ){
            if (trabaIdk.charAt(i) != 't'){
                continue;
            }
            cantidad12++;
        }
        System.out.println("Se a encontrado la 't' " + cantidad12 + " veces");
    }
}
