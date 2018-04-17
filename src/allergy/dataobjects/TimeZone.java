package allergy.dataobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by kasir on 4/2/2018.
 */
public class TimeZone {

    private String name;
    private Date birthDate;
    private String continent;
    private String city;

    //constructor and getters and setters

    public String getBirthDateInOtherTimeZone(String continent, String city)
    {
        return covertToOtherTimeZone(continent, city);
    }
    public String covertToOtherTimeZone(String continent, String city)
    {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(this.birthDate);
        DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd HH:mm:ss z");
        dateFormat.setCalendar(calendar);
        dateFormat.setTimeZone(java.util.TimeZone.getTimeZone(continent+""+city));
        return dateFormat.format(calendar.getTime());

    }
}
