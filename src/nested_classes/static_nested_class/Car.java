package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
        method();
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine engine = new Engine(300);
        System.out.println(engine.horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;
        private static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(a++);
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    interface I {}
}

class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e);

        Car car = new Car("red", 2, e);
        System.out.println(car);
    }
}

class Z extends Car.Engine {
    Z() {
        super(200);
    }
}
