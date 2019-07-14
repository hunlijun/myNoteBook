package free.max.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现接口 VS 继承 Thread
 * 实现接口会更好一些，因为：
 * Java 不支持多重继承，因此继承了 Thread 类就无法继承其它类，但是可以实现多个接口；
 * 类可能只要求可执行就行，继承整个 Thread 类开销过大。
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        return 123;
    }
}
