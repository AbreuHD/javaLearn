import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateGG {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat dF = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaSTR = dF.format(fecha);

        System.out.println("fechaSTR = " + fechaSTR);

    }
}
