package liveable;

public class Human extends Creature{
    protected Mood attitude = Mood.UNLIKE;
    public Creature interlocuter;
    
    public Human(Creature carlson){
        this(carlson, "");
    }
    
    public Human(Creature carlson, String s){
        this.interlocuter = carlson;
        if (!"".equals(s))
            this.name = s;
        if ("Малыш".equals(this.name)) 
            this.attitude = Mood.LIKE;
        if ("".equals(s))
            System.out.println("Человек без имени создан.");
        else
            System.out.println("Человек "+this.getName()+" создан.");
    };
    
    public void tryToChange(){
        if (Math.random() > 0.5&&this.attitude == Mood.UNLIKE) {
            attitude = Mood.LIKE;
            System.out.println(this.getName()+": Теперь мне нравится "
                    + this.interlocuter.getName() +"!"
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
