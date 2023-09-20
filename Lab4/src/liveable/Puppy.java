package liveable;

import troubles.ParentNameException;

public class Puppy extends Creature implements Petable {
    Human owner;
    
    public Puppy(Human parent, String s)throws ParentNameException{
        try{
            if ("noname".equals(parent.getName()))
                throw new ParentNameException("Молодой щенок не может найти "
                        + " хозяина.", parent, "Сам не знаю, кто:(");
            this.owner = parent;
        } catch(ParentNameException e) {
            System.out.println(e.getMessage());
            this.owner = e.getParent();
        }
        this.name = s;
        System.out.println("Щенок "+ this.getName()+ " создан.");
    }
    
    @Override       
    public String getOwnerName(){
        return owner.getName();
    }
    
    public void bark(){
        System.out.println(this.getName() + ": Гав-Гав, мой любимый хозяин - "+
                this.getOwnerName());
    }
    
    @Override
    public int hashCode() {
        return super.hashCode()+this.owner.hashCode()+this.name.hashCode(); 
    }

    @Override
    public String toString() {
        return  "Puppy, "+this.name+", owner: "+this.owner.toString(); 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()==Puppy.class){
            Puppy cloned = (Puppy)obj;
            if (this.name==cloned.name&&this.owner==cloned.owner){
                return true;
            }
        }
        return false;
    }
}
