import org.junit.Test;
import org.junit.Assert;

public class JsonTest {

    @Test
    public void positiveTesting() {
        Object expectedResult = "websites";
        Assert.assertEquals("The element not exists", expectedResult);
    }

    @Test
    public void negativeTesting(){
        Object expectedResult2 = "programs";
        Assert.assertEquals("The element exists", expectedResult2);
    }

}
