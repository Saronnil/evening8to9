package Collections;

public enum MonthsEnum {
   January (1,"January"),
    February (2,"February"),
    March (3,"March"),
    April (4,"April"),
    MAY(5, "May"),
    JUNE(6, "June"),
    JULY(7, "July"),
    AUGUST(8, "August"),
    SEPTEMBER(9, "September"),
    OCTOBER(10, "October"),
    NOVEMBER(11, "November"),
    DECEMBER(12, "December");

   public int getMonthNumber(){
       return monthNumber;
   }
    public String getMonthName() {
        return monthName;
    }

    public final int monthNumber;
    public final String monthName;

    MonthsEnum(int monthNumber, String monthName) {
        this.monthNumber = monthNumber;
        this.monthName = monthName;
    }


}


