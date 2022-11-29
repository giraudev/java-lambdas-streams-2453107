package tec.giraudev;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {

        //say hello - first way
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        //say hello - second way
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        greeting2.sayHello();

        //say hello - third way
        Greeting greeting3 = () -> System.out.println("Hello World");
        greeting3.sayHello();

        //calculator interface 1
        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y +randomNumber;
        };
        System.out.println(calculator.calculate(1,2));

        //calculator interface 2
        IntBinaryOperator calculator2 = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y +randomNumber;
        };
        System.out.println(calculator2.applyAsInt(1,2));
    }
}
