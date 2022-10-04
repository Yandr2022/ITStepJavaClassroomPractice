package itStep.yandr.javaLessons.lesson39;

public class Main {
    public static void main(String[] args) {
//        EnumSeason s1 = EnumSeason.WINTER;
//        EnumSeason s2 = EnumSeason.SPRING;
//        EnumSeason s3 = EnumSeason.SUMMER;
//        EnumSeason s4 = EnumSeason.AUTUMN;
//        DayOfWeek day = DayOfWeek.MONDAY;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

//        FlowerColor color = FlowerColor.BLUE;
//        System.out.println(color);
//        System.out.println(color.ordinal());
//         String name = "Red";
//        for (FlowerColor color:FlowerColor.values()) {
//            if (name.equals(color.name())) {
//                FlowerColor c = FlowerColor.valueOf(name);
//                System.out.println(c);
//            }
//        }

        EnumSeason season = null;
        switch (season) {
            case WINTER:
                System.out.println(0);break;
            case SPRING:
                System.out.println(1);break;
            case SUMMER:
                System.out.println(2);break;
            case AUTUMN:
                System.out.println(3);break;
            default:
                throw new IllegalStateException("Unexpected value: " + season);
        }


    }
}
