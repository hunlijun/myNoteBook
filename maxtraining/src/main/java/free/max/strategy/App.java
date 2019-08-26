package free.max.strategy;

/**
 * 策略模式
 */
public class App {
    public static void main(String[] args) {
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.chageStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();
    }
}
