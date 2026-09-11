class CounterThread extends Thread
{
    public void run()
    {
        for(int i=1; i<6; i++)
        {
            System.out.println("Task Count: "+i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("Thread was interrupted");
        }
    }
}

public class TaskManager 
{
    public static void main(String[] args)
    {
        CounterThread counter = new CounterThread();
        counter.start();
    }
}
