public class ConversionDeTipos {
    public static void main(String[] args){
        String str = "59";

        int numeroInt = Integer.parseInt(str);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9854.56e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicStr = "true";
        boolean logicBool = Boolean.parseBoolean(logicStr);
        System.out.println("logicBool = " + logicBool);

        logicStr = "5 > 2";
        logicBool = Boolean.parseBoolean(logicStr);
        System.out.println("logicBool = " + logicBool);

        int otroInt = 100;
        String otroStr = Integer.toString(otroInt);
        System.out.println("otroStr = " + otroStr);

        String unString = String.valueOf(otroInt+50);
        System.out.println("unString = " + unString);
    }
}
