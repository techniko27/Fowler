import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by scheuermann on 03.05.2017.
 */
public class MovieTest {

    Movie m1 = new Movie("movie1", 1);

    @org.junit.Test
    public void setPriceCode() throws Exception
    {
        m1.setPriceCode(2);
        Assert.assertEquals(2,m1.getPriceCode());
    }

    @org.junit.Test
    public void getPriceCode() throws Exception
    {
        Assert.assertEquals(1,m1.getPriceCode());
    }

    @org.junit.Test
    public void getTitle() throws Exception
    {
        Assert.assertEquals("movie1",m1.getTitle());
    }

}