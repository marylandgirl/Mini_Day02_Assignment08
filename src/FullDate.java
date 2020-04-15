import java.util.Scanner;
public class FullDate {
    public static void main(String[] args) {
        int monthNum;
        int dayNum;
        int yearNum;
        String monthName = "";
        boolean validDate = false;

        System.out.print("Enter month (mm): ");
        monthNum = new Scanner(System.in).nextInt();

        System.out.print("Enter day (dd): ");
        dayNum = new Scanner(System.in).nextInt();

        System.out.print("Enter year (yy): ");
        yearNum = new Scanner(System.in).nextInt();

        if (yearNum > 20)
            yearNum += 1900;
        else
            yearNum += 2000;

        switch(monthNum){
            case 1:
                monthName = "January";
                if (dayNum >= 1 && dayNum <= 31) {
                        validDate = true;
                }
                break;
            case 2:
                monthName = "February";
                if (yearNum%4 == 0){
                    if (dayNum >=  1 && dayNum <= 29)
                        validDate = true;
                } else if (dayNum >= 1 && dayNum <= 28)
                    validDate = true;
                break;
            case 3:
                monthName = "March";
                if (dayNum >= 1 && dayNum <= 31)
                    validDate = true;
                break;
            case 4:
                monthName = "April";
                if (dayNum >= 1 && dayNum <= 30)
                    validDate = true;
                break;
            case 5:
                monthName = "May";
                if (dayNum >= 1 && dayNum <= 31)
                    validDate = true;
                break;
            case 6:
                monthName = "June";
                if (dayNum >= 1 && dayNum <= 30)
                    validDate = true;
                break;
            case 7:
                monthName = "July";
                if (dayNum >= 1 && dayNum <= 31)
                    validDate = true;
                break;
            case 8:
                monthName = "August";
                if (dayNum >= 1 && dayNum <= 31)
                    validDate = true;
                break;
            case 9:
                monthName = "September";
                if (dayNum >= 1 && dayNum <= 30)
                    validDate = true;
                break;
            case 10:
                monthName = "October";
                if (dayNum >= 1 && dayNum <= 31)
                    validDate = true;
                break;
            case 11:
                monthName = "November";
                if (dayNum >= 1 && dayNum <= 30)
                    validDate = true;
                break;
            case 12:
                monthName = "December";
                if (dayNum >= 1 && dayNum <= 31)
                    validDate = true;
                break;
            default:
                System.out.println("An invalid value was entered for the month");
                break;
        }
        if (validDate) {
            System.out.println("It is " + monthName + " " + dayNum + " " + yearNum);
        }
    }
}
