package Calender;

public class Calender extends Century {

    private String MonthsName;
    private int MonthDays;
    public int MonthonList;

    String getMonthName() {

        return MonthsName;
    }

    int getMonthDays() {

        return MonthDays;
    }

    void setMonthName(int monthNumber) {

        if (monthNumber == 1) {

            MonthsName = "January";
        }

        else if (monthNumber == 2) {

            MonthsName = "February";
        }

        else if (monthNumber == 3) {

            MonthsName = "March";
        }

        else if (monthNumber == 4) {

            MonthsName = "April";
        }

        else if (monthNumber == 5) {

            MonthsName = "May";
        }

        else if (monthNumber == 6) {

            MonthsName = "June";
        }

        else if (monthNumber == 7) {

            MonthsName = "July";
        }

        else if (monthNumber == 8) {

            MonthsName = "August";
        }

        else if (monthNumber == 9) {

            MonthsName = "September";
        }

        else if (monthNumber == 10) {

            MonthsName = "October";
        }

        else if (monthNumber == 11) {

            MonthsName = "November";
        }

        else if (monthNumber == 12) {

            MonthsName = "December";
        }

        else {

            MonthsName = "None";
        }

    }

    void setMonthDays(int monthNumber) {

        if (monthNumber == 1) {

            MonthDays = 31;
        }

        else if (monthNumber == 2) {

            MonthDays = 28;
        }

        else if (monthNumber == 3) {

            MonthDays = 31;
        }

        else if (monthNumber == 4) {

            MonthDays = 30;
        }

        else if (monthNumber == 5) {

            MonthDays = 31;
        }

        else if (monthNumber == 6) {

            MonthDays = 30;
        }

        else if (monthNumber == 7) {

            MonthDays = 31;
        }

        else if (monthNumber == 8) {

            MonthDays = 31;
        }

        else if (monthNumber == 9) {

            MonthDays = 30;
        }

        else if (monthNumber == 10) {

            MonthDays = 31;
        }

        else if (monthNumber == 11) {

            MonthDays = 30;
        }

        else if (monthNumber == 12) {

            MonthDays = 31;
        }

        else {

            MonthDays = 0;
        }

    }

    Calender() {
    }

    Calender(int monthNumber, int year) {
        super(monthNumber);

        setMonthName(monthNumber);
        setMonthDays(monthNumber);
        setCentury(year);
    }

}
