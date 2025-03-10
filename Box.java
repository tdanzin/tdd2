import java.util.ArrayList;
public class Box {

    private ArrayList<Thing> contents = new ArrayList<>();
    private char status = '0';

    /**
     * Ajoute un truc à la boîte.
     * @param truc un truc
     */
    public void add(Thing truc){
        this.contents.add(truc);
    }

    /**
     * Indique si le truc est dans la boîte.
     * @param truc un truc
     * @return le truc est dans la boîte
     */
    public boolean contient(Thing truc){
        return this.contents.contains(truc);
    }

    /**
     * Retire un truc de la boîte s'il y est.
     * @param truc un truc
     */
    public void retirer(Thing truc){
        if (this.contient(truc)){
            this.contents.remove(truc);
        }
    }

    public boolean isOpen(){
        return this.status == 'O';
    }

    public void open(){
        this.status = 'O';
    }

    public void close(){
        this.status = 'F';
    }

    public String actionLook(){
        String res = "";
        if (this.isOpen()){
            res = "La boîte contient: ";
            for (Thing truc : contents){
                res+= truc + ", ";
            }
        }
        else{
            res = "La boîte est fermée";
        }
        return res;
    }

}
