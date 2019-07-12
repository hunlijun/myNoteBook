package free.max.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 基础线程机制
 * Executor 管理多个异步任务的执行，而无需程序员显式地管理线程的生命周期。
 * 这里的异步是指多个任务的执行互不干扰，不需要进行同步操作。
 * 主要有三种 Executor：
 *      CachedThreadPool：一个任务创建一个线程；
 *      FixedThreadPool：所有任务只能使用固定大小的线程；
 *      SingleThreadExecutor：相当于大小为 1 的 FixedThreadPool。
 */
public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }

        //调用 Executor 的 shutdown() 方法会等待线程都执行完毕之后再关闭
        //但是如果调用的是 shutdownNow() 方法，则相当于调用每个线程的 interrupt() 方法。
        executorService.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable");
    }
}
