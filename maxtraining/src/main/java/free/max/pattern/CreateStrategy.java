package free.max.pattern;

public class CreateStrategy {

    private  StrategyInterface strategyInterface;

    public CreateStrategy(StrategyInterface strategyInterface){
        this.strategyInterface = strategyInterface;
    }

    public void changeStrategy(StrategyInterface strategyInterface){
        this.strategyInterface = strategyInterface;
    }

    public void toExecute(){
        this.strategyInterface.execute();
    }
}
