package Collections;

public class CallingEnums {
    public static void main (String [] args){
        WeekDays w1 = WeekDays.Monday;
        System.out.println(w1);
        System.out.println(w1.ordinal());
        System.out.println("******************************************************************************************");
        WeekDays[] w2 = WeekDays.values();

        for (WeekDays i : w2){
            System.out.println(i);
        }

        System.out.println("******************************************************************************************");

        WeekDays.Monday.setWeekday("Weekday");
        WeekDays.Tuesday.setWeekday("Weekday");
        WeekDays.Wednesday.setWeekday("Weekday");
        WeekDays.Thursday.setWeekday("Weekday");
        WeekDays.Friday.setWeekday("Weekday");
        WeekDays.Saturday.setWeekday("Weekend");
        WeekDays.Sunday.setWeekday("Weekend");

        for (WeekDays w : w2){
            System.out.println(w + "is a "+ w.getWeekday());
        }
        MonthsEnum m1 = MonthsEnum.April;
        System.out.println(m1.monthName);
        System.out.println(m1.monthNumber);
    }
}
