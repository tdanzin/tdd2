import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BoxTest{
    @Test 
    public void BoxTestAll(){
        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        b.add(truc1);
        b.add(truc2);
        Thing chose = new Thing("Chose1");
        assert b.contient(truc2);
        b.retirer(chose);
    }
}