package its;

import static java.lang.System.out;

public class Program {
    public static void main(String... args) {
        methodReference();
        lambda();
    }

    private static void methodReference() {
        var duck = (Quacks & Waddles) Mixin::create;
        out.println(duck.getClass());
        duck.quack();
        duck.waddle();
    }

    private static void lambda() {
        var duck = (Quacks & Waddles) (() -> {
        });
        out.println(duck.getClass());
        duck.quack();
        duck.waddle();
    }
}