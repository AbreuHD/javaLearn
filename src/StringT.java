public class StringT {
    public static void main(String[] args){
        String str1 = "Hey hello";
        String aqw = "hey hello";
        String pop = "Hey hello";
        boolean logicPiece;
        
        logicPiece = str1 == aqw;
        System.out.println("logicPiece = " + logicPiece);
        
        logicPiece = str1 == pop;
        System.out.println("logicPiece = " + logicPiece);
        
        logicPiece = str1.equals(aqw);
        System.out.println("logicPiece = " + logicPiece);
        
        logicPiece = str1.equalsIgnoreCase(aqw);
        System.out.println("logicPiece = " + logicPiece);

        String strLamba = str1;
        strLamba.transform(c -> {
            return c + " no es igual a " + aqw;
        });
        System.out.println("strLamba = " + strLamba);

        System.out.println(strLamba.replace("a", "A"));
    }
}
