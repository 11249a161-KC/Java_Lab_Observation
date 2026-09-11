class PaymentProcessor implements Runnable
{
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("Payment Processing...");
        }
        try
        {
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println("Payment Failed");
        }
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor task = new PaymentProcessor();
        Thread paymentThread = new Thread(task);
        paymentThread.start();
    }
}
