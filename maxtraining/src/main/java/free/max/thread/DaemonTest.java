package free.max.thread;

/**Daemon
 *守护线程是程序运行时在后台提供服务的线程，不属于程序中不可或缺的部分。
 * 当所有非守护线程结束时，程序也就终止，同时会杀死所有守护线程。
 * main() 属于非守护线程。
 * 在线程启动之前使用 setDaemon() 方法可以将一个线程设置为守护线程。
 */
public class DaemonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
