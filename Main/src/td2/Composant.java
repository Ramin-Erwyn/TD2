package td2;
import java.io.*;
import java.util.*;
public interface Composant{


    default String getName(){
        return name;
    }
/*
        public void setName(String name) {
             this.name = name;
        }

 */

    public  int getSize() {

        return size;
    }

    public  String getContent() {
        return content;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }



}