package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }
}

class Math {
    private int i = 10;

    public void getResult(final int one, final int two) {
        class Division {
            public int getResult() {
                return one / two;
            }

            public int getMod() {
                return one % two;
            }
        }

        Division division = new Division();

        System.out.println("One=" + one);
        System.out.println("Two=" + two);
        System.out.println("Result=" + division.getResult());
        System.out.println("Mod=" + division.getMod());
    }
}
