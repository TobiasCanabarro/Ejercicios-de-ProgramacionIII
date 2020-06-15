package edu.utn;

public enum DayOfWeek {
    MONDAY("MONDAY", 1), TUESDAY("TUESDAY", 2), WEDNESDAY("WEDNESDAY", 3), THURSDAY("THURSDAY", 4),
    FRIDAY("FRIDAY", 5), SATURDAY("SATURDAY", 6), SUNDAY("SUNDAY", 7);

    private String day;
    private int dayNum;

    DayOfWeek (String day, int dayNum){
        setDay(day);
        setDayNum(dayNum);
    }

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public static void showDay(){
        System.out.println(MONDAY.getDay() + " " + MONDAY.getDayNum() + " " + MONDAY.ordinal());
        System.out.println(TUESDAY.getDay() + " " + TUESDAY.getDayNum() + " " + TUESDAY.ordinal());
        System.out.println(WEDNESDAY.getDay() + " " + WEDNESDAY.getDayNum() + " " + WEDNESDAY.ordinal());
        System.out.println(THURSDAY.getDay() + " " + THURSDAY.getDayNum() + " " + THURSDAY.ordinal());
        System.out.println(FRIDAY.getDay() + " " + FRIDAY.getDayNum() + " " + FRIDAY.ordinal());
        System.out.println(SATURDAY.getDay() + " " + SATURDAY.getDayNum() + " " + SATURDAY.ordinal());
        System.out.println(SUNDAY.getDay() + " " + SUNDAY.getDayNum() + " " + SUNDAY.ordinal());
    }
}
