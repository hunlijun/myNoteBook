package free.max.strategy;

public class DragonSlayer {
    private DragonSlayerStrategy dragonSlayerStrategy;

    public DragonSlayer(DragonSlayerStrategy dragonSlayerStrategy){
        this.dragonSlayerStrategy=dragonSlayerStrategy;
    }

    public void chageStrategy(DragonSlayerStrategy dragonSlayerStrategy){
        this.dragonSlayerStrategy=dragonSlayerStrategy;
    }

    public  void goToBattle(){
        this.dragonSlayerStrategy.battle();
    }
}
