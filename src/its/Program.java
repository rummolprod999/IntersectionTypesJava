package its;

import static java.lang.System.out;

public class Program {
    public static void main(String... args) {
        var duck = (Quacks & Waddles) Mixin::create;
        out.println(duck.getClass());
        duck.quack();
        duck.waddle();
    }
}