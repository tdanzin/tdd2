import java.util.ArrayList;
public class Thing{
    
    String name;

    public Thing(String name){
        this.name = name;
    }
}
public class Box {

    ArrayList<String> contents = new ArrayList<>();

    public void add(String truc){
        this.contents.add(truc);
    }
}
