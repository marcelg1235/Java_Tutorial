public class Test {
    public static void main(String[] args){
        int day = 10;
        String dayName;

        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
            case 7:
                dayName = "Weekend";
                break;
            default:
                dayName = "Invalid input";
                break;
        }

        /*if (day == 1){
            dayName = "Monday";
        } else if (day == 2) {
            dayName = "Tuesday";
        } else if (day == 3) {
            dayName = "Wednesday";
        } else if (day == 4) {
            dayName = "Thursday";
        } else if (day == 5) {
            dayName = "Friday";
        } else if (day == 6) {
            dayName = "Weekend";
        } else if (day == 7) {
            dayName = "Weekend";
        } else {
            dayName = "Invalid input";
        }*/

        System.out.println("It's: " + dayName);
    }
}
