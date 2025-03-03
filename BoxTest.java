import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BoxTest{
    @Test 
    public void BoxTestAll(){
        Box b = new Box();
        b.add("truc1");
        b.add("truc2");
        Thing chose = new Thing("Chose1");
    }
}