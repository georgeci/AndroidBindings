package com.georgeci.bindingssample;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Nick on 09.06.2015.
 */
public class UnixDateConverter {
    public static String convert(long timestamp) {
        Calendar mydate = Calendar.getInstance();
        mydate.setTimeInMillis(timestamp * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(mydate.getTime());
    }
}
