package liveable;

public class Carlson extends Creature{
    public Carlson(){
        this.name = "Карлсон";
        System.out.println("Карлсон прилетел (создан).");
    }
    
    public void buzzing(){
        System.out.println(this.getName()+
                " заводит моторчик: *бзз-бзз* Полетели!");
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode(); 
    }

    @Override
    public String toString() {
        return "Carlson, "+this.name; 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()==Carlson.class){
            return true;
        }
        return false;
    }
    
    
}
