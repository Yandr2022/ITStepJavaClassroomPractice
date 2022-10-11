package itStep.yandr.javaLessons.lesson35;
class A{

}
class B extends  A{

}
class C extends B {

}

public class Main {
    public static void main(String[] args) {


        A a = new C();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a.getClass()==new  A().getClass());
        System.out.println(a.getClass()==new  B().getClass());
        System.out.println(a.getClass()==new  C().getClass());

        Box <String>box1 = new Box<>();
        Box <Integer>box2 = new Box<>();
        box2.setValue(100);
        box1.setValue("100");


        System.out.println(box1+"\n"+box2);
    }
}

