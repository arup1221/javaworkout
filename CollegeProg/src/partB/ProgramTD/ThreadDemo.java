package partB.ProgramTD;

public class ThreadDemo implements Runnable{
    private Thread thread;
    public ThreadDemo(String name){
        thread = new Thread(this,name);
        System.out.println("Geating thread: " + thread);
    }

    public void run(){
        System.out.println("Running Thread: " + thread);
        try{
            Thread.sleep(1000);
            Thread.yield();
            Thread t = new Thread(new AnotherThread());
            t.start();
            t.join();
            thread.interrupt();
        }
        catch(InterruptedException c){
            System.out.println("Thread Interapted");
        }
        System.out.println("Thread existing:"+ thread);
    }
    public void start(){
        System.out.println("Starting thread:"+thread);
        thread.start();
    }

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo("Thread 1");
        demo.start();
    }
    private static class AnotherThread implements Runnable{
        public void run(){
            System.out.println("Running another thread");
        }
    }
}
