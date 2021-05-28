package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
        // method();
    }

    // void method() {
    //     System.out.println(Engine.countOfObjects);
    //     Engine engine = new Engine(300);
    //     System.out.println(engine.horsePower);
    // }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
        Car car = new Car("Green", 4, 300);
        System.out.println(car);
    }
}
