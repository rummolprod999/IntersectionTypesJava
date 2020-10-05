package its;

interface Quacks extends Mixin {
    default void quack() {
        System.out.println("Quack");
    }
}
