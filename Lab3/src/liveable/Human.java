package liveable;

public class Human extends Creature{
    Mood attitude = Mood.UNLIKE;
    Carlson interlocuter;
    
    public Human(Carlson carlson, String s){
        this.interlocuter = carlson;
        this.name = s;
        if ("Малыш".equals(this.name)) this.attitude = Mood.LIKE;
        System.out.println("Человек "+this.getName()+" создан.");
    };
    
    public void tryToChange(){
        if (Math.random() > 0.5&&this.attitude == Mood.UNLIKE) {
            attitude = Mood.LIKE;
            System.out.println(this.getName()+": Теперь мне нравится Карлсон!"
                    + " И он нужен Малышу!");
        } 
        if (this.attitude == Mood.UNLIKE){
            System.out.println(this.getName()+": Мне все еще не нравится "+
                    this.interlocuter.getName()+"!");
        }
    }
    
    public Mood getMood(){return this.attitude;}
    
    public void say(){
        if (this.getMood()==Mood.UNLIKE) {
            System.out.println(this.getName()+": Мне не нравится "+
                    this.interlocuter.getName()+"!");
        } else {
            System.out.println(this.getName()+": Мне нравится "+
                    this.interlocuter.getName()+".");
        }
    }
    
    @Override
    public int hashCode() {
        return super.hashCode()+this.name.hashCode()+this.attitude.hashCode()+
                this.interlocuter.hashCode(); 
    }

    @Override
    public String toString() {
        return  "Human, "+this.name+", "+this.attitude.toString()+", "
                +this.interlocuter.toString(); 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass()==Human.class){
            Human cloned = (Human)obj;
            if (this.name==cloned.name&&this.interlocuter==cloned.interlocuter&&
                    this.attitude==cloned.attitude){
                return true;
            }
        }
        return false;
    }
}
