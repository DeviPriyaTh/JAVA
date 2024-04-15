class Thread_fact extends Thread{
    int n;
    Thread_fact(int n) {
        this.n = n;
    }
    public void run() {
        int f = 1;
        for(int i = 1;i<n;i++) f *= i;
        System.out.println("Factorial is "+f);
    }
}
class Thread_mul extends Thread {
    int n;
    Thread_mul(int n) {
        this.n = n;
    }
    public void run() {
    System.out.println("Multiplication is ");
    for(int i = 1;i<10;i++) {
        System.out.println(i+"*"+n+"="+i*n);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }}
}

class main_thread {
    public static void main(String a[]) {
    Thread_fact f = new Thread_fact(5);
    Thread_mul m = new Thread_mul(5);
    Thread t1 = new Thread(f);
    Thread t2 = new Thread(m);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        System.out.println(t2.isAlive());
        t1.start();
        System.out.println(t1.getPriority());
}}

