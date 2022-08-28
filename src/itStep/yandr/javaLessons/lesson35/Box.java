package itStep.yandr.javaLessons.lesson35;

public class Box {
    private Object value;


    public Box(Object value) {
        this.value = value;
    }

    public Box() {

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value + "";
    }
}
