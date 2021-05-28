package nested_classes.anonymous_class;

public class AnonymousClass {
    private int x= 42;
    public static void main(String[] args) {
        Math3 m = new Math3() {
            int c = 10;
            int abc() {
                return c;
            }
            @Override
            public int doOperation(int a, int b) {
                return a+b+abc();
            }
        };

        Math3 m2 = new Math3() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                return a*b - ac.x;
            }
        };
        System.out.println(m.doOperation(5, 3));
        System.out.println(m2.doOperation(6, 7));
    }
}

interface Math3 {
    int doOperation(int a, int b);
}
