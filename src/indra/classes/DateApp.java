package indra.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date(23587200000L);

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.YEAR, 2010);
        calendar.add(calendar.YEAR, -10);
        calendar.set(calendar.MONTH, calendar.JANUARY);
        calendar.set(calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
