
class ThreadExample extends Thread {

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() +" Crazy Numbers " + i);
        }

    }


}

public class testThread {
    public static void main(String args[]) {

        for(int i = 1; i < 5; i++){
        ThreadExample threadexample = new ThreadExample();
        threadexample.start();
    }
}
}