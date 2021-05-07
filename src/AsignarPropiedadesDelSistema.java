import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args){
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("config.animal.nombre", "Napoleon");
            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e){
            System.out.println("no existe el archivo = " + e);

        }
    }
}
