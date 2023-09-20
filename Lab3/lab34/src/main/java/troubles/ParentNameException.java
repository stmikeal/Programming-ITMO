package troubles;

import liveable.Human;

public class ParentNameException extends RuntimeException{
    private Human newParent;
    public Human getParent(){return newParent;}
    public ParentNameException(String message, Human parent, String newName){
        super(message);
        this.newParent = new Human(parent.interlocuter, newName);
    }
}
