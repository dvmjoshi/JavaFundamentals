class runthread implements Runnable
{
    private int threadId;
    private int delay;
    runthread(int id, int d)
    {
        threadId=id;
        delay = d;
    }
    public void run()
    {
        for(int i=1;i<3;i++)
        {
            System.out.println("Thread " + threadId +" is running");
            try
            {
                Thread.sleep(delay);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadId +" is Finished");
    }
}
 class RunnableThread
{
    public static void main(String[] args)
    {
        System.out.println("Main thread starts");
        runthread r1 = new runthread(1,500);
        runthread r2 = new runthread(2,300);
        runthread r3 = new runthread(3,600);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main thread is finished");
    }
}

