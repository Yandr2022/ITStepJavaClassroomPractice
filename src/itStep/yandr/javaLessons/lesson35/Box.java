package itStep.yandr.javaLessons.lesson35;

public class Box <T> {
    private T value;


    public Box(T value) {
        this.value = value;
    }

    public Box() {

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value + "";
    }
}
