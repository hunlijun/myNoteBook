package free.max.concurrent.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample {

    public static void main(String[] args) {
        SynchronizedExample e1 = new SynchronizedExample();
        SynchronizedExample e2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func2());
        executorService.execute(() -> e2.func2());

        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e1.func1());
    }

    //对象级别
    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    //类级别
    public void func2() {
        synchronized (SynchronizedExample.class) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
