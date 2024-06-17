public class ThreadExample extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Example Started");
        for (int i = 0; i < 10; i++) {
            System.out.println("Executing task 2 job " + i);
        }
    }
    public static void main(String[] args) {
        System.out.println("App started");
        for (int i = 0; i < 10; i++) {
            System.out.println("Executing task 1 job " + i);
        }
        ThreadExample t1 = new ThreadExample(); 
        t1.start(); 
        System.out.println("App Finished");
    }
}
