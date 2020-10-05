package its;

interface Waddles extends Mixin {
    default void waddle() {
        System.out.println("Waddle");
    }
}
