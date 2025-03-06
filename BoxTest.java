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
        assert b.isOpen();
        b.close();
        assert !(b.isOpen());
        System.out.println(b.actionLook());
        Thing chose2 = new Thing("Chose2", 3);
        assert chose2.volume() == 3;
        
    }
}