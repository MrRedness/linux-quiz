import java.util.concurrent.TimeUnit;

public class sleep {
    public static void sec(int sec)
    {
        try
        {
            TimeUnit.SECONDS.sleep(sec);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void ms(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
