public class MonthName {

    public static void main(String[] args) {
        System.out.println("Month 1 is: " + getMonth(1));
        System.out.println("Month 12 is: " + getMonth(12));
        System.out.println("Month 24 is: " + getMonth(24));
    }

    public static String getMonth (int x) {
        String month = "ERROR";
        switch (x) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "Juli"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
        }
        return month;
    }

}
