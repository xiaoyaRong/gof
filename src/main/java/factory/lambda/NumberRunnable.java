package factory.lambda;

public class NumberRunnable implements Runnable  {

    @Override
    public void run() {
        for (int i = 230; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        new Thread( new NumberRunnable() ).start();

    }
}
