package Calender;

public class Months extends Calender {

    Months() {
    }

    Months(int monthNum, int year) {
        super(monthNum, year);
    }

    void output() {

        System.out.println(" Month: " + getMonthName());
        System.out.println(" Days: " + getMonthDays());
        System.out.println(" Century: " + getCentury());
    }

}
