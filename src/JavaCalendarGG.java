import java.util.Calendar;
import java.util.Date;

public class JavaCalendarGG {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(2020, Calendar.MAY, 6, 00, 00, 01);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
    }
}
