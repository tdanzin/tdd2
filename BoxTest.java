import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BoxTest{
    @Test 
    public void BoxTestCreate(){
        Box b = new Box();
    }
    /** on veut pouvoir mettre des trucs dedans */
    @Test
    public void BoxTestAdd(){
        Box b = new Box();
        b.add("truc1");
        b.add("truc2");
    }
}