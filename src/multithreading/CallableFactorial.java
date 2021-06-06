package multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(12);
        Future<Integer> future = executorService.submit(factorial2);
        System.out.println(future.isDone());
        System.out.println("We want res");
        factorialResult = future.get();
        System.out.println("We have res");
        System.out.println(future.isDone());
        System.out.println(factorialResult);
        executorService.shutdown();
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Vi vveli nevernoe chislo");
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
            Thread.sleep(1000);
        }
        return res;
    }
}
