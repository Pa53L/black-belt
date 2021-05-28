package nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Adding implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }

        Adding adding = new Adding();
        System.out.println(adding.doOperation(5, 3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
