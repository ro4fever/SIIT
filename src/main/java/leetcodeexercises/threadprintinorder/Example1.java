package leetcodeexercises.threadprintinorder;


public class Example1 {

    static int[] threadNum = {1, 3, 2};

    public void first() {
        print("first");
    }

    public void second() {
        print("second");
    }

    public void third() {
        print("third");
    }

    public void print(String s) {
        System.out.print(s);
    }

    public static void main(String[] args) throws InterruptedException {

        Example1 example = new Example1();

        Runnable r1 = example::first;
        Runnable r2 = example::second;
        Runnable r3 = example::third;

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        int counter = 1;

        while (counter <= threadNum.length) {
            for (int i : threadNum) {
                if (i == 1 && counter == 1) {
                    t1.start();
                    t1.join();
                    counter++;
                }
                if (i == 2 && counter == 2) {
                    t2.start();
                    t2.join();
                    counter++;
                }
                if (i == 3 && counter == 3) {
                    t3.start();
                    t3.join();
                    counter++;
                }
            }
        }
    }
}