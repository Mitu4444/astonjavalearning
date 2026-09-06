package module.three.strategy;

public class Main {
    public static void main(String[] args) {

        Potion buffPotion = new Potion(new HealingEffect());
        buffPotion.drink();

        buffPotion.setEffect(new StrengthEffect());
        buffPotion.drink();

        buffPotion.setEffect(null);
        buffPotion.drink();

    }
}
