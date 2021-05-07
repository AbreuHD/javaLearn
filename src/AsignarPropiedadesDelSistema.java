import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args){
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("config.animal.nombre", "Napoleon");
            System.setProperties(p);
//          System.getProperties().list(System.out);
            p.list(System.out);
            System.out.println(p.getProperty("config.animal.nombre"));

        } catch (Exception e){
            System.out.println("no existe el archivo = " + e);

        }
    }
}
