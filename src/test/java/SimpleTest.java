import junit.framework.Assert;
import org.junit.Test;
import java.util.Random;


/**
 * Created by gadiel on 15/11/2016.
 */
public class SimpleTest {

   // @Test
   public void alwaysPass1()
   {
       Assert.assertEquals(1, 1);
   }

     @Test
    public void alwaysPass2()
    {
        Assert.assertEquals(1, 1);
    }

      @Test
    public void alwaysFail1()
    {
        Assert.assertEquals(1, 0);
    }

    @Test
    public void alwaysFail2()
    {
        Assert.assertEquals(1, 0);
    }

     @Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }

    @Test
    public void sometimesPass2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
}
