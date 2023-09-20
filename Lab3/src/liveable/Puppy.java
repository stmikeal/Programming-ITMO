/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveable;

/**
 *
 * @author mike
 */
public class Puppy extends Creature implements Petable {
    Creature owner;
    
    public Puppy(Creature parent, String s){
        this.owner = parent;
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
