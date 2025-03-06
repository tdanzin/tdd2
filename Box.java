import java.util.ArrayList;
public class Box {

    private ArrayList<Thing> contents = new ArrayList<>();

    public void add(Thing truc){
        this.contents.add(truc);
    }

    public boolean contient(Thing truc){
        return this.contents.contains(truc);
    }
}
