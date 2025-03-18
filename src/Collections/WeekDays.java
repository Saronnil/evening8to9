package Collections;

public enum WeekDays {

        //public WeekDays extends Enum --> This is how it is being processed inside the compiler

        //Enum is a special type of class that represents a group of constants (unchangeable variables, like final variables).
        //Enum is nothing but a collection of constant Values

    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
    WeekDays(){
        System.out.println("Weekdays Enum is called ");

    }

    private String weekday;

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday( String weekday) {
        this.weekday = weekday;
    }
}
//Similar to a class we can have constructors, methods, getters and setters in Enum
//We Cannot create an object of Enum