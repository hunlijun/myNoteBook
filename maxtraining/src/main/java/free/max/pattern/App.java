package free.max.pattern;

import free.max.pattern.CreateStrategy;
import free.max.pattern.Strategy01;
import free.max.pattern.Strategy02;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        CreateStrategy createStrategy = new CreateStrategy(new Strategy01());
        createStrategy.toExecute();

        createStrategy.changeStrategy(new Strategy02());
        createStrategy.toExecute();

        //CreateStrategy createStrategyNew = new CreateStrategy(() -> System.out.println("匿名execute"));
        //createStrategyNew.toExecute();
    }
}
