package free.max.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassTest {
    public static void main(String[] args) {
        Test test = new Test();

        test.increment();
        System.out.println(test.getCount());

        Test2 test2 = new Test2();
        test2.increment();
        System.out.println(test2.getCount());
    }
}

//多线程环境不使用原子类保证线程安全（基本数据类型）
class Test {
    private volatile int count = 0;
    //若要线程安全执行执行count++，需要加锁
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

//多线程环境使用原子类保证线程安全（基本数据类型）
class Test2 {
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }
    //使用AtomicInteger之后，不需要加锁，也可以实现线程安全。
    public int getCount() {
        return count.get();
    }
}
