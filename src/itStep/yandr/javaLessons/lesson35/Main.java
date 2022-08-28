package itStep.yandr.javaLessons.lesson35;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setValue(100);
        box1.setValue("100");
        Object o = box1.getValue();
        if (o instanceof Integer) {
            int n = (int) o;
        } else if (o instanceof String) {
            String s = (String) o;
        }
        System.out.println(box1);
    }

}
