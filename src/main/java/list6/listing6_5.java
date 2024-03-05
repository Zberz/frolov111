package list6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class listing6_5 {
    private Date fromDate = null;
    private SimpleDateFormat formatter = null;

    public listing6_5 (Date anyDate) {
        fromDate = anyDate;
        formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
    }

    public int getDay () {
        formatter.applyPattern("d");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMonth() {
        formatter.applyPattern("M");
        return  Integer.parseInt(formatter.format(fromDate));
    }

    public  int getYear () {
        formatter.applyPattern("y");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getHour() {
        formatter.applyPattern("h");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMinute() {
        formatter.applyPattern("m");
        return Integer.parseInt(formatter.format(fromDate));
    }
}
class DatePartTest {
    public static void main(String[] args) {

        Date currentDate = new Date();
        listing6_5 dp = new listing6_5(currentDate);
        int month = dp.getMonth();

        System.out.println("Текущий месяц: " + month);
    }
}
