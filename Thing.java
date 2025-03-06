public class Thing{
    
    String name;
    int capacite;

    public Thing(String name, int capacite){
        this.name = name;
        this.capacite = capacite;
    }

    public Thing(String name){
        this.name = name;
        this.capacite = -1;
    }

    public int volume(){
        return this.capacite;
    }
}