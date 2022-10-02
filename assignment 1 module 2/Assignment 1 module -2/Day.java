/*05.Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.*/


import java.util.Scanner;
public class Day 
{
    public static void main(String args[])
    {
        int d, year, week, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        d = s.nextInt();
        year = d / 365;
        d = d % 365;
        System.out.println("No. of years:"+year);
        week = d / 7;
        d = d % 7;
        System.out.println("No. of weeks:"+week);
        day = d;
        System.out.println("No. of days:"+day);
    }
}