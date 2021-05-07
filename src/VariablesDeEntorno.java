import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variantes de ambiente del sistema = " + varEnv);

        System.out.println("Listando las variables del sistema");
        for (String key : varEnv.keySet()){ System.out.println(key + " => " + varEnv.get(key)); }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("TEMP"));
        System.out.println(System.getenv("Path"));
        String paTH = varEnv.get("Path");
        System.out.println("paTH = " + paTH);
    }
}
