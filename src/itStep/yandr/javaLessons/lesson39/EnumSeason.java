package itStep.yandr.javaLessons.lesson39;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum FlowerColor{
    RED, BLUE, GREEN, YELLOW
}

enum Killer {
    KILLER;

    public void kill() {

    }

}

enum EnumSeason {

    WINTER("Winter",1), SPRING("Spring",2), SUMMER("Summer",3), AUTUMN("Autumn",4);
    private String name;
    private int order;

    EnumSeason(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return name + "( " + order + " )";
    }
}
