class DownloadImage {
    synchronized void downloadImage(int num, String imgName) {
        for (int i = 0; i < num; i++) {
            System.out.println("Downloading image " + imgName + " " + i);
            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     e.printStackTrace();
            // }
        }
    }
}

class MyThread extends Thread {
    DownloadImage dref;

    MyThread(DownloadImage dref) {
        this.dref = dref;
    }

    @Override
    public void run() {
        dref.downloadImage(10, "Dog");
    }
}

class YourThread extends Thread {
    DownloadImage dref;

    YourThread(DownloadImage dref) {
        this.dref = dref;
    }

    @Override
    public void run() {
        dref.downloadImage(10, "Cat");
    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        DownloadImage dref = new DownloadImage();
        MyThread t1 = new MyThread(dref);
        YourThread t2 = new YourThread(dref);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
