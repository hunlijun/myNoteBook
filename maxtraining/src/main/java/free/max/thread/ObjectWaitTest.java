package free.max.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ObjectWaitTest {
    private static Object object = new Object();

    public static void main(String[] args) {


        new Thread(() -> {
            try {
                synchronized (object){
                    object.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程1");
        }).start();


        new Thread(() -> {
            synchronized (object){

                System.out.println("线程2");
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                object.notifyAll();
            }
        }).start();

        //通过线程池创建
        /*ThreadFactory threadFactory = new ThreadFactoryBuilder().
                setNameFormat("demo-pool-%d").build();
        ExecutorService executorService = new ThreadPoolExecutor(1,1,0L, TimeUnit.MICROSECONDS,
                new LinkedBlockingDeque<Runnable>(1024),threadFactory,new ThreadPoolExecutor.AbortPolicy());

        executorService.execute(()-> System.out.println(Thread.currentThread().getName()));
        executorService.shutdown();*/
    }
}
