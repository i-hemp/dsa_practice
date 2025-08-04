package daily.wed020725.pack1;
class MyStoppableThread extends Thread {
    @Override
    public void run() {
        try {
            // Thread.currentThread().isInterrupted(); 
            // {
            //     // Perform some work
            //     System.out.println("Thread is running...");
                Thread.sleep(1000); // Simulate work and potential interruption point
            // }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted! Exiting gracefully.");
            // Clean up resources if necessary
        } finally {
            System.out.println("Thread finished.");
        }
    }
}

public class ThreadStopExample {
    public static void main(String[] args) throws InterruptedException {
        MyStoppableThread thread = new MyStoppableThread();
        thread.start();

        // Let the thread run for a few seconds
        Thread.sleep(3000);

        // Interrupt the thread
        thread.interrupt();
    }
}