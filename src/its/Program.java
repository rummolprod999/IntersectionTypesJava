package its;

public class Program {
    public static void main(String... args) {
        var duck = (Quacks & Waddles) Mixin::create;
        duck.quack();
        duck.waddle();
    }
}