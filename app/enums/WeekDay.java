
package app.enums;

public enum WeekDay { // enums values for specific items that will never change 
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(7);

    public int valueType;

    WeekDay(int value) { // controls variable to allow class to assign player positions 
        valueType = value;
    }
}
