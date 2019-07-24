package newdatetimeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * java.time.temporal.ChronoUnit enum is added in Java 8 to replace the integer values
 * used in old API to represent day, month, etc. Let us see them in action.
 *
 */
public class ChronoUnitsEnum {
    public static void main(String[] args) {
        ChronoUnitsEnum chronoUnitsEnum = new ChronoUnitsEnum();
        chronoUnitsEnum.testChronoUnits();

    }

    public void testChronoUnits(){
        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current Day: "+ today);

        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next Week: "+ nextWeek);

        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next Month: "+ nextMonth);

        //add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next Year: "+ nextYear);

        //add 10 years to the current date
        LocalDate nextDecade = today.plus(10, ChronoUnit.YEARS);
        System.out.println("Date after 10 years or after a decade: "+ nextDecade);


    }
}
