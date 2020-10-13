package td2;
import java.util.*;
import td2.Composant.*;
public abstract class composite implements Composant{


    String Children;
    ArrayList<String> Child = new ArrayList<String>();

    public ArrayList<String> getChild() {
        return Child;
    }

    public String getChildren() {
        return Children;
    }
    public void addChild(){

    }
    public void removeChild(){

    }
    public void removeChildren(){

    }
}
