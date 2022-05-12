import java.util.concurrent.Semaphore;

public class Task implements Runnable{
  Semaphore semaphore;

  public Task(Semaphore semaphore) {
    this.semaphore = semaphore;
  }

  @Override
  public void run() {
    try {
      semaphore.acquire();
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName());
      }
      semaphore.release();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
