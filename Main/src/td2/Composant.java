package td2;
import java.io.*;
import java.util.*;
public interface Composant{

    public abstract int getSize();
    public abstract String getName();
    public abstract String getContent();
    public abstract String getOwner();
    public abstract String setOwner();


}