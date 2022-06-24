package Calender;

public class Century {

    private int centuryNum;

    int getCentury() {

        return centuryNum;
    }

    void setCentury(int year) {

        if (year < 2100 && year >= 2000) {

            centuryNum = 21;
        }

        else if (year < 2000 && year >= 1900) {

            centuryNum = 20;
        }

        else if (year < 1900 && year >= 1800) {

            centuryNum = 19;
        }

        else if (year < 1800 && year >= 1700) {

            centuryNum = 18;
        }

        else if (year < 1700 && year >= 1600) {

            centuryNum = 17;
        }

        else if (year < 1600 && year >= 1500) {

            centuryNum = 16;
        }

        else if (year < 1500 && year >= 1400) {

            centuryNum = 15;
        }

        else if (year < 1400 && year >= 1300) {

            centuryNum = 14;
        }

        else if (year < 1300 && year >= 1200) {

            centuryNum = 13;
        }

        else if (year < 1200 && year >= 1100) {

            centuryNum = 12;
        }

        else if (year < 1100 && year >= 1000) {

            centuryNum = 11;
        }

        else if (year < 1000 && year >= 900) {

            centuryNum = 10;
        }

        else if (year < 900 && year >= 800) {

            centuryNum = 9;
        }

        else if (year < 800 && year >= 700) {

            centuryNum = 8;
        }

        else if (year < 700 && year >= 600) {

            centuryNum = 7;
        }

        else if (year < 600 && year >= 500) {

            centuryNum = 6;
        }

        else if (year < 500 && year >= 400) {

            centuryNum = 5;
        }

        else if (year < 400 && year >= 300) {

            centuryNum = 4;
        }

        else if (year < 300 && year >= 200) {

            centuryNum = 3;
        }

        else if (year < 200 && year >= 100) {

            centuryNum = 2;
        }

        else if (year < 100 && year >= 0) {

            centuryNum = 1;
        }

    }

    Century() {
    }

    Century(int year) {

        setCentury(year);
    }
}
