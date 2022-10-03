package itStep.yandr.javaLessons.lesson39;

public class Season {
    public static  final Season WINTER = new Season("Winter",1);
    public static  final Season SPRING = new Season("Spring",2);
    public static  final Season SUMMER = new Season("Summer",3);
    public static  final Season AUTUMN = new Season("Autumn",4);
    private String name;
    private int order;

    private Season(String name, int order) {
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
