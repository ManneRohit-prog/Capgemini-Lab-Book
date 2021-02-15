package pack;
import java.util.*;

public class Lab33{
public static void main(String[] args)
{
    int y_d = 365;
    int m_d = 30;

    Scanner scn = new Scanner(System.in);
    
    java.util. Date d = new java.util. Date();
    
    int currentDay = d.getDate();
    int currentMonth = d.getMonth();
    int currentYear = d.getYear()+1900;

    Calendar cal1 = Calendar.getInstance();
    cal1.set(currentYear, currentMonth-1,currentDay);

    System.out.println();
    System.out.println("Enter your previous date: ");

    System.out.print("Day   : ");
    int day2 = scn.nextInt();

    System.out.print("Month : ");
    int month2 = scn.nextInt();

    System.out.print("Year  : ");
    int year2 = scn.nextInt();

    Calendar cal2 = Calendar.getInstance();
    cal2.set(year2,month2-1,day2);

    long milis1 = cal1.getTimeInMillis();
    long milis2 = cal2.getTimeInMillis();

    long day = milis2 - milis1;

    long days = day / (24*60*60*1000);

    long y_r = (days % y_d);
    long m_r = (y_r % m_d);

    System.out.println("Duration");
    System.out.println(Math.abs(days/y_d) + " year(s)");
    System.out.println(Math.abs(y_r/m_d )+ " month(s)");
    System.out.println(Math.abs(m_r)+Math.abs(days/y_d)+(Math.abs(days/y_d)/4) + " day(s)");
}
}