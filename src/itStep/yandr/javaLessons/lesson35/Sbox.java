package itStep.yandr.javaLessons.lesson35;

public class Sbox {

    private String value;

    public Sbox(String value) {
        this.value = value;
    }

    public Sbox() {

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}

