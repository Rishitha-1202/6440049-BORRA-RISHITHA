enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
            default -> System.out.println("Weekday");
        }
    }
}
