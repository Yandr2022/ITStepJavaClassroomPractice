package itStep.yandr.javaLessons.lesson39;

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
