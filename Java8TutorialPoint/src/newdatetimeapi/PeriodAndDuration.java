package newdatetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * With Java 8, two specialized classes are introduced to deal with the time differences.
 *     Period − It deals with date based amount of time.
 *     Duration − It deals with time based amount of time.
 */
public class PeriodAndDuration {
    public static void main(String[] args) {
        PeriodAndDuration periodAndDuration = new PeriodAndDuration();
        System.out.println("-----------------Period for Dates-------------------------");
        periodAndDuration.testPeriod();

        System.out.println("-----------------Duration for Time -------------------------");
        periodAndDuration.testDuration();




    }

    public void testPeriod(){
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current Date "+ date1);

        //add 1 month to the current date
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: "+ date2);

        Period period = Period.between(date2,date1);
        System.out.println("Period: "+ period);
    }

    private void testDuration(){

        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofHours(2);
        System.out.println("Time Now: "+ time1);

        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time1, time2);
        System.out.println("Time Now plus 2 hours: "+ time2);


        System.out.println("Duration: "+ duration);
    }
}
