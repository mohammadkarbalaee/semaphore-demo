import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(1);
    for (int i = 1; i <= 5; i++) {
      Thread thread = new Thread(new Task(semaphore));
      thread.setName("thread " + i);
      thread.start();
    }
  }
}
