package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.Scanner;
public class Fallthrough {




        public static void main(String[] args) {
            do {
                System.out.println("Hello world!");
            } while (3 < 2);

            System.out.println("Enter an integer: ");
            Scanner in = new Scanner(System.in);
            int dayNum = in.nextInt();

            String day;
            switch (dayNum) {
                case 0:
                    day = "Sunday";
                case 1:
                    day = "Monday";
                case 2:
                    day = "Tuesday";
                case 3:
                    day = "Wednesday";
                case 4:
                    day = "Thursday";
                case 5:
                    day = "Friday";
                case 6:
                    day = "Saturday";
                default:
                    // in this example, this block runs even if one of the above blocks match
                    day = "Int does not correspond to a day of the week";
            }
            System.out.println(day);
        }
    }



