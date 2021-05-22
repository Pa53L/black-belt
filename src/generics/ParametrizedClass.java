package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello!");
//        System.out.println(info1);
//        String s = info1.getValue();
//        System.out.println(s);
        Info<Integer> info2 = new Info<>(1999);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println(i);

        Info<Double> info21 = new Info<>(3.14);
        System.out.println(info21);
    }
}

class Info<T extends Number> {
    private T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

//class Parent {
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//}

//class Child extends Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//} // TYPE ERASURE работает даже с классами
