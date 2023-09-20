package liveable;

import smi.*;

public class Parent extends Human{
    private final Media[] subject = new Media[3];
    
    public Parent(Carlson carlson, String s){
        super(carlson, s);
        subject[0] = new News();
        subject[1] = new Magazine();
        subject[2] = new TV();
    }
    
    public void imagine(){
        System.out.println(this.getName()+
                " представляет, что произойдёт,"
                + " если кто-нибудь узнает о Карлсоне:");
        for (Media m:subject){
            m.say();
        }
        System.out.println(this.getName()+": Ужас!");
    }
    
    @Override
    public int hashCode() {
        return super.hashCode()+this.subject.hashCode(); 
    }

    @Override
    public String toString() {
        return  "Parent, "+this.name+", "+this.attitude.toString()+", "
                +this.interlocuter.toString()+", "+this.subject.toString(); 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()==Parent.class){
            Parent cloned = (Parent)obj;
            if (this.name==cloned.name&&this.interlocuter==cloned.interlocuter&&
                    this.attitude==cloned.attitude&&
                    this.subject.equals(cloned.subject)){
                return true;
            }
        }
        return false;
    }
}
